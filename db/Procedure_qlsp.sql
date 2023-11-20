use SD18313_PRO1041;

select * from DmAppParam where ma = 'TRANG_THAI' and trangThai > 0;

ALTER PROCEDURE qlsp_search
AS
BEGIN
    SELECT
        sp.id,
        sp.maSanPham,
        spct.maSanPhamCt,
        sp.ten as "tenSp",
        spct.giaBan as "giaBan",
        spct.idDanhMuc as "danhMuc",
        dm.ten as "danhMucText",
        spct.idHangSx as "nhaSx",
        hs.ten as "nhaSxText",
        spct.idMauSac as "mauSac",
        ms.ten as "mauSacText",
        spct.idKichCo as "kichCo",
        kc.ten as "kichCoText"
    FROM SanPham sp
    LEFT JOIN SanPhamCt spct ON sp.id = spct.idSp
    LEFT JOIN DanhMuc dm ON spct.idDanhMuc = dm.id AND dm.trangThai > 0
    LEFT JOIN MauSac ms ON spct.idMauSac = ms.id AND ms.trangThai > 0
    LEFT JOIN KichCo kc ON spct.idKichCo = kc.id AND kc.trangThai > 0
    LEFT JOIN HangSx hs ON spct.idHangSx = hs.id AND hs.trangThai > 0;
END;

--

ALTER PROCEDURE qlsp_search2
    @MaSp nvarchar(20),
    @TenSp nvarchar(Max),
    @TrangThai bit,
    @HangSx int,
    @DanhMuc int,
    @KichCo int,
    @MauSac int
AS
BEGIN
    SELECT
        sp.id,
        sp.maSanPham,
        spct.maSanPhamCt,
        sp.ten as "tenSp",
        spct.giaBan as "giaBan",
        spct.idDanhMuc as "danhMuc",
        dm.ten as "danhMucText",
        spct.idHangSx as "nhaSx",
        hs.ten as "nhaSxText",
        spct.idMauSac as "mauSac",
        ms.ten as "mauSacText",
        spct.idKichCo as "kichCo",
        kc.ten as "kichCoText"
    FROM SanPham sp
    LEFT JOIN SanPhamCt spct ON sp.id = spct.idSp
    LEFT JOIN DanhMuc dm ON spct.idDanhMuc = dm.id AND dm.trangThai > 0
    LEFT JOIN MauSac ms ON spct.idMauSac = ms.id AND ms.trangThai > 0
    LEFT JOIN KichCo kc ON spct.idKichCo = kc.id AND kc.trangThai > 0
    LEFT JOIN HangSx hs ON spct.idHangSx = hs.id AND hs.trangThai > 0
    WHERE 
    (sp.maSanPham LIKE  CONCAT('%', @MaSp, '%'))
    AND (sp.ten LIKE  CONCAT('%',CONVERT(NVARCHAR(MAX), @TenSP), '%'))
    AND (@TrangThai IS NULL OR spct.trangThai = @TrangThai)
    AND (@HangSx = 0 OR spct.idHangSx = @HangSx)
    AND (@DanhMuc = 0 OR spct.idDanhMuc = @DanhMuc)
    AND (@KichCo = 0 OR spct.idKichCo = @KichCo)
    AND (@MauSac = 0 OR spct.idMauSac = @MauSac);
END;

--

ALTER PROCEDURE qlsp_insert_sp
    @MaSp nvarchar(20),
    @Ten nvarchar(Max)
AS
BEGIN
    Insert into
    SanPham(maSanPham, ten) 
    values (
    	@MaSp,
    	@Ten
    )
    
    select * from SanPham sp where sp.maSanPham = @MaSp;
END;

--

CREATE PROCEDURE qlsp_update_status_sp
    @MaSp nvarchar(20)
AS
BEGIN
    UPDATE SanPhamCt set trangThai = 0 where maSanPhamCt = @maSp;
END;

--

CREATE PROCEDURE qlsp_insert_spct
    @MaSp nvarchar(50),
    @idSp int,
    @giaBan float,
    @giaNhap float,
    @soLuong float,
    @moTa nvarchar(max),
    @trangThai bit,
    @idHangSx int,
    @idKichCo int,
    @idMauSac int,
    @idDanhMuc int,
    @idHinhAnh int
AS
BEGIN
    Insert into
    SanPhamCt(maSanPhamCt, idSp,
    giaNhap, giaBan, soLuong, moTa, trangThai, idHangSx, idKichCo
    , idMauSac, idDanhMuc, idHinhAnh) 
    values (
    	@MaSp,
    	@idSp,
    	@giaBan,
    	@giaNhap,
   	 	@soLuong,
    	@moTa,
    	@trangThai,
    	@idHangSx,
    	@idKichCo,
    	@idMauSac,
    	@idDanhMuc,
    	@idHinhAnh
    )
END;

--

CREATE PROCEDURE lsp_insert_spct
    @MaSp nvarchar(20),
    @idSp int,
    @mota nvarchar(Max),
    @giaBan float,
    @giaNhap float,
    @soLuong int,
    @idMauSac int,
    @idDanhMuc int,
    @idKichCo int,
    @idHangSx int,
    @trangThai bit
AS
BEGIN
    Insert into
    SanPhamCt(
    idSp,
    maSanPhamCt,
    mota,
    giaNhap,
    giaBan,
    soLuong,
    trangThai,
    idHangSx,
    idDanhMuc,
    idKichCo,
    idMauSac,
    idHinhAnh
    ) 
    values (
    	@idSp,
    	@MaSp,
    	@mota,
    	@giaNhap,
    	@giaBan,
    	@soLuong,
    	@trangThai,
    	@idHangSx,
    	@idDanhMuc,
    	@idKichCo,
    	@idMauSac,
    	NULL
    )
END;
---

CREATE PROCEDURE qlsp_select_spct_by_id
@Masp varchar(50),
@MaspCt varchar(50)
as
begin
	select 
	 sp.id,
	 sp.maSanPham,
	 spct.maSanPhamCt,
	 sp.ten as "tenSp",
	 spct.giaBan,
	 spct.giaNhap,
	 spct.soLuong,
	 spct.idDanhMuc as "danhMuc",
	 spct.idHangSx as "hangSx",
	 spct.idKichCo as "kichCo",
	 spct.idMauSac as "mauSac",
	 spct.trangThai,
	 spct.moTa
	from 
	SanPham sp
	left join SanPhamCt spct on spct.idSp = sp.id
	Where sp.maSanPham = @Masp and spct.maSanPhamCt = @MaspCt;
end

--

CREATE PROCEDURE qlsp_insert_spct
    @MaSp nvarchar(50),
    @idSp int,
    @giaBan float,
    @giaNhap float,
    @soLuong float,
    @moTa nvarchar(max),
    @trangThai bit,
    @idHangSx int,
    @idKichCo int,
    @idMauSac int,
    @idDanhMuc int,
    @idHinhAnh int
AS
BEGIN
    Insert into
    SanPhamCt(maSanPhamCt, idSp,
    giaNhap, giaBan, soLuong, moTa, trangThai, idHangSx, idKichCo
    , idMauSac, idDanhMuc, idHinhAnh) 
    values (
    	@MaSp,
    	@idSp,
    	@giaBan,
    	@giaNhap,
   	 	@soLuong,
    	@moTa,
    	@trangThai,
    	@idHangSx,
    	@idKichCo,
    	@idMauSac,
    	@idDanhMuc,
    	@idHinhAnh
    )
END;

---

ALTER PROCEDURE qlsp_update_SanPham
    @maSp nvarchar(50),
    @maSpCt nvarchar(50),
    @ten nvarchar(Max),
    @giaBan float,
    @giaNhap float,
    @soLuong int,
    @trangThai bit,
    @mota nvarchar(Max),
    @mau int,
    @danhMuc int,
    @size int,
    @nhaSx int,
    @hinhAnh int
AS
BEGIN
    Update SanPham
    SET ten = @ten
    Where maSanPham = @maSp;
    
    begin
    	Update SanPhamCt
    	SET giaBan = @giaBan,
    	giaNhap = @giaNhap,
    	soLuong = @soLuong,
    	trangThai = @trangThai,
    	mota = @mota,
    	idMauSac = @mau,
    	idDanhMuc = @danhMuc,
    	idKichCo = @size,
    	idHangSx = @nhaSx,
    	idHinhAnh = @hinhAnh
    Where maSanPhamCt = @maSpCt;
    end
END;
--
--ALTER PROCEDURE qlsp_update_SanPham
--    @maSp nvarchar(50),
--    @ten nvarchar(MAX),
--    @giaBan float,
--    @giaNhap float,
--    @soLuong int,
--    @trangThai bit,
--    @mota nvarchar(MAX),
--    @mau int,
--    @danhMuc int,
--    @size int,
--    @nhaSx int,
--    @hinhAnh int
--AS
--BEGIN
--    BEGIN TRY
--        BEGIN TRANSACTION;
--
--        -- Cập nhật thông tin chung của sản phẩm
--        UPDATE SanPham
--        SET ten = @ten
--        WHERE maSanPham = @maSp;
--
--        -- Cập nhật thông tin chi tiết của sản phẩm
--        UPDATE SanPhamCt
--        SET giaBan = @giaBan,
--            giaNhap = @giaNhap,
--            soLuong = @soLuong,
--            trangThai = @trangThai,
--            mota = @mota,
--            idMauSac = @mau,
--            idDanhMuc = @danhMuc,
--            idKichCo = @size,
--            idHangSx = @nhaSx,
--            idHinhAnh = @hinhAnh
--        WHERE maSanPhamCt = @maSp;
--
--        COMMIT;
--    END TRY
--    BEGIN CATCH
--        ROLLBACK; -- Nếu có lỗi, hủy bỏ các thay đổi
--        -- Thực hiện xử lý lỗi nếu cần
--        SELECT ERROR_MESSAGE() AS ErrorMessage;
--    END CATCH;
--END;

----- 
select * from SanPhamCt

CREATE PROCEDURE qlsp_delete_SanPham
    @maSp varchar(50)
AS
BEGIN
	DECLARE @idSanPham INT;
	SELECT @idSanPham = id
    FROM sanPham
    WHERE maSanPham = @maSp;
   
   	BEGIN
	   	IF @idSanPham IS NOT NULL
	   	BEGIN
	   		DELETE FROM SanPhamCt where idSp = @idSanPham;
	   	END
   		DELETE FROM sanPham where maSanPham = @maSp;
   	END
END;

---

CREATE PROCEDURE qlsp_delete_SanPhamCt
    @maSpCt varchar(50)
AS
BEGIN
	DELETE FROM SanPhamCt where maSanPhamCt  = @maSpCt;
END;


--- 
CREATE PROCEDURE qlsp_delete_SanPham_2
    @maSpCt varchar(50)
AS
BEGIN
	DECLARE @idSanPham INT;
	SELECT @idSanPham = id
    FROM sanPham
    WHERE maSanPham = @maSp;
   
   	BEGIN
	   	IF @idSanPham IS NOT NULL
	   	BEGIN
	   		DELETE FROM SanPhamCt where idSp = @idSanPham;
	   	END
   		DELETE FROM sanPham where maSanPham = @maSp;
   	END
END;

--

CREATE PROCEDURE qlDm_create_danhmuc
    @value nvarchar(max),
    @bangInsert varchar(max)
AS
BEGIN
    UPDATE SanPhamCt set trangThai = 0 where maSanPhamCt = @maSp;
END;

--




