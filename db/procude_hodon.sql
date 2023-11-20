CREATE PROCEDURE cnbanHang_select_hoadon
@ttTk int,
@dateForm date,
@dateTo date
as
begin
	select 
	 hd.*,
	 dm_tt.ten as 'trangThaiText',
	 nv.ten as 'tenNv',
	 nv.maNv 
	from 
	HoaDon hd
	left join DmAppParam dm_tt on dm_tt.giaTri = cast(hd.trangThai as varchar) and dm_tt.ma = 'TT_HD' and dm_tt.trangThai = 1
	left join NhanVien nv on nv.id = hd.idNV 
	where (@ttTk = 0 or hd.trangThai = @ttTk)
	AND (@dateForm is Null or hd.ngayBan BETWEEN @dateForm AND @dateTo);
end
EXECUTE  cnbanHang_select_hoadon
-- 
CREATE PROCEDURE cnbanHang_select_hoadon_byid
@mahd varchar(50)
as
begin
	select 
	 hd.*,
	 dm_tt.ten as 'trangThaiText',
	 nv.ten as 'tenNv',
	 nv.maNv 
	from 
	HoaDon hd
	left join DmAppParam dm_tt on dm_tt.giaTri = cast(hd.trangThai as varchar) and dm_tt.ma = 'TT_HD' and dm_tt.trangThai = 1
	left join NhanVien nv on nv.id = hd.idNV 
	where hd.maHd = @maHd
end
---
CREATE PROCEDURE cnbanHang_select_hoadonct_byid
@mahd varchar(50)
as
begin
	select 
	 hdct.*,
	 sp.ten as 'tenSp',
	 sp.maSanPham  as 'maSp',
	 spct.giaBan,
	 spct.giaNhap
	from 
	HoaDonCt hdct
	left join HoaDon hd on hd.id = hdct.idHd
	left join SanPhamCt spct on spct.id = hdct.idSpCt
	left join SanPham sp on spct.idSp = sp.id 
	where hd.maHd = @maHd
end

ALTER PROCEDURE cnbanHang_create_hoadon
@mahd varchar(50),
@idKachHang int,
@idKm int,
@idNV int,
@ngayBan date,
@tongTien float,
@trangThai int
as
begin
	insert into hoadon
	 (mahd, idKachHang, idKm, idNV, ngayBan, tongTien, trangThai)
	values
	(@mahd, @idKachHang, null, @idNV, @ngayBan, @tongTien, 2) -- 1 đã hoàn thành/ 2 chờ/ 3 hủy
	
	EXECUTE cnbanHang_select_hoadon_byid @mahd;
end

---

CREATE PROCEDURE cnbanHang_create_khachhang
@sdt varchar(15),
@ten nvarchar(max)
as
begin
	IF Exists (select 1 from khachhang where sdt = @sdt)
	BEGIN 
		select * from khachhang where sdt = @sdt;
	END
	ELSE 
	BEGIN
		insert into khachHang (sdt, ten) values (@sdt, @ten);
		select * from khachhang where sdt = @sdt;
	END
end

--

CREATE PROCEDURE cnbanHang_select_khachhang
@sdt varchar(15)
as
begin
	select * from khachhang where sdt = @sdt;
end

--

CREATE PROCEDURE cnbanHang_select_sanpham
@tukhoa nvarchar(max)
as
begin
	select 
		sp.id,
		sp.ten as 'tenSp',
		sp.maSanPham as 'maSp',
		spct.soLuong,
		spct.giaNhap,
		spct.giaBan,
		spct.moTa
	from sanPham sp
	left join SanPhamCt spct on sp.id = spct.idSp
	where
	sp.ten LIKE  CONCAT('%',CONVERT(NVARCHAR(MAX), @tukhoa), '%')
	OR
	sp.maSanPham LIKE  CONCAT('%',CONVERT(NVARCHAR(MAX), @tukhoa), '%');
end

--

CREATE PROCEDURE cnbanHang_select_sanpham_by_masp
@maSp varchar(50)
as
begin
	select 
		sp.id,
		sp.ten as 'tenSp',
		sp.maSanPham as 'maSp',
		spct.soLuong,
		spct.giaNhap,
		spct.giaBan,
		spct.moTa
	from sanPham sp
	left join SanPhamCt spct on sp.id = spct.idSp
	where
	sp.maSanPham LIKE @maSp;
end

--

ALTER PROCEDURE cnbanHang_create_or_update_hoadonct
@idHd int,
@idSpCt int,
@gia float,
@soLuong int
as
begin
	BEGIN TRY
        BEGIN TRANSACTION;
       
	IF Exists (select 1 from hoaDonCt ct where ct.idHd = @idHd and ct.idSpCt = @idSpCt)
	BEGIN 
		update HoaDonCt
		set soLuong = soLuong + @soLuong,
		gia = gia + @gia
		where idHd = @idHd AND idSpCt = @idSpCt;
	
		update SanPhamCt 
		set soLuong = soLuong - @soLuong
		where id = @idSpCt;
	
		EXECUTE cnbanHang_update_tongtien_hoadon @idHd;
	END
	ELSE 
	BEGIN
		insert into HoaDonCt (idHd, idSpCt, gia, soLuong, trangThai) values (@idHd, @idSpCt, @gia, @soLuong, 1);
	
		update SanPhamCt 
		set soLuong = soLuong - @soLuong
		where id = @idSpCt;
	
		EXECUTE cnbanHang_update_tongtien_hoadon @idHd;
	END
	
	    COMMIT;
    END TRY
    
    BEGIN CATCH
        ROLLBACK; -- Nếu có lỗi, hủy bỏ các thay đổi
        -- Thực hiện xử lý lỗi nếu cần
        SELECT ERROR_MESSAGE() AS ErrorMessage;
    END CATCH;
end

CREATE PROCEDURE cnbanHang_update_tongtien_hoadon
@idHd int
as
begin
	BEGIN TRY
        BEGIN TRANSACTION;
	
			DECLARE @tongGia float;
		
			select @tongGia = Sum(gia * soLuong)
			from HoaDonCt hdct where hdct.idHd = @idHd;
		
			update HoaDon set tongTien = @tongGia where id = @idHd;
	   	COMMIT;
    	
	   END TRY
    
    BEGIN CATCH
        ROLLBACK;
        SELECT ERROR_MESSAGE() AS ErrorMessage;
    END CATCH;
end

---

CREATE PROCEDURE cnbanHang_update_trangthai_hoadon
@idHd int,
@trangThai int
as
begin
	update HoaDon set trangThai = @trangThai where id = @idHd;
end

--

CREATE PROCEDURE cnbanHang_update_sanphamct
@idSpCt int,
@soLuong int
as
begin
	update SanPhamCt set soLuong = soLuong + @soLuong where id = @idSpCt;
end