use master;

CREATE DATABASE SD18313_PRO1041;

USE SD18313_PRO1041;

create table DM_Dung_Chung(
	id INT IDENTITY(1,1) PRIMARY KEY,
    ma VARCHAR(50),
    ten NVARCHAR(Max),
    trangThai bit,
    giaTri varchar(MAX)
);
GO
CREATE TABLE HangSx (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE DanhMuc (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE MauSac (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE KichCo (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE VaiTro  (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE LichSu (
    id INT IDENTITY(1,1) PRIMARY KEY,
    moTa NVARCHAR(MAX),
    trangThai bit,
    ngayNhap date,
    nguoiNhap varchar(20)
);
GO
CREATE TABLE HinhAnh (
    id INT IDENTITY(1,1) PRIMARY KEY,
    url NVARCHAR(MAX),
    loaiAnh varchar(100)
);
GO
CREATE TABLE SanPham (
    id INT IDENTITY(1,1) PRIMARY KEY,
    maSanPham NVARCHAR(50) unique not null,
    ten nvarchar(Max)
);
GO
CREATE TABLE SanPhamCt (
    id INT IDENTITY(1,1) PRIMARY KEY,
    maSanPhamCt NVARCHAR(50) unique not null,
    idSp int,
    giaNhap float,
    giaBan float,
    soLuong int,
    moTa NVARCHAR(Max),
    trangThai bit,
    idHangSx int,
    idKichCo int,
    idMauSac int,
    idDanhMuc int,
    idHinhAnh int
);
Go
CREATE TABLE HoaDon (
    id INT IDENTITY(1,1) PRIMARY KEY,
    maHd NVARCHAR(50) unique not null,
    idKachHang int,
    idKm int,
    idNV int,
    ngayBan date,
    tongTien float,
    trangThai int
);
Go
CREATE TABLE HoaDonCt (
    id INT IDENTITY(1,1) PRIMARY KEY,
    idHd int,
    idSpCt int,
    gia float,
    soLuong int,
    trangThai bit
);
GO
CREATE TABLE ThanhToan (
	id INT IDENTITY(1,1) PRIMARY KEY,
    maThanhToan NVARCHAR(50) unique not null,
    idHd int,
    type varchar(20),
    name Nvarchar(MAX),
    value Nvarchar(MAX)
);
GO
CREATE TABLE KhachHang (
	id INT IDENTITY(1,1) PRIMARY KEY,
    ten Nvarchar(MAX),
    gioiTinh bit,
    sdt Nvarchar(15),
    diaChi Nvarchar(MAX)
);
GO
CREATE TABLE KhuyenMai(
	id INT IDENTITY(1,1) PRIMARY KEY,
    ten Nvarchar(MAX),
    maGiamGia NVARCHAR(50) unique not null,
    giaTri float,
    dieuKien Nvarchar(MAX),
    soLuong int,
    ngayBatDau date,
    ngayKetThuc date,
    idLoaiKm int
);
Go
CREATE TABLE LoaiKm (
    id INT IDENTITY(1,1) PRIMARY KEY,
    ten NVARCHAR(MAX),
    trangThai bit
);
GO
CREATE TABLE NhanVien (
    id INT IDENTITY(1,1) PRIMARY KEY,
    maNv VARCHAR(50) unique not null,
    password VARCHAR(20),
    idVaiTro int,
    ten NVARCHAR(MAX),
    gioiTinh bit,
    email NVARCHAR(MAX),
    phonenumber VARCHAR(20),
    diaChi Nvarchar(MAX),
    ngaySinh date,
    idHinhAnh int
);
GO
--
ALTER TABLE NhanVien
ADD CONSTRAINT PK_NV_VaiTro
FOREIGN KEY (idVaiTro) REFERENCES VaiTro(id);
--
GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_SP
FOREIGN KEY (idSp) REFERENCES SanPham(id);

GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_HangSx
FOREIGN KEY (idHangSx) REFERENCES HangSx(id);

GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_KichCo
FOREIGN KEY (idKichCo) REFERENCES KichCo(id);

GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_MauSac
FOREIGN KEY (idMauSac) REFERENCES MauSac(id);

GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_DanhMuc
FOREIGN KEY (idDanhMuc) REFERENCES DanhMuc(id);

GO
ALTER TABLE SanPhamCt
ADD CONSTRAINT PK_SPCT_HA
FOREIGN KEY (idHinhAnh) REFERENCES HinhAnh(id);

-- HOA DON CT
GO
ALTER TABLE HoaDonCt 
ADD CONSTRAINT PK_HDCT_SPCT
FOREIGN KEY (idSpCt) REFERENCES SanPhamCt(id);

GO
ALTER TABLE HoaDonCt
ADD CONSTRAINT PK_HDCT_HoaDon
FOREIGN KEY (idHd) REFERENCES HoaDon(id);

-- HOA DON

GO
ALTER TABLE HoaDon 
ADD CONSTRAINT PK_HD_NV
FOREIGN KEY (idNv) REFERENCES NhanVien(id);

GO
ALTER TABLE HoaDon 
ADD CONSTRAINT PK_HD_KM
FOREIGN KEY (idKm) REFERENCES KhuyenMai(id);

GO
ALTER TABLE HoaDon 
ADD CONSTRAINT PK_HD_KH
FOREIGN KEY (idKachHang) REFERENCES KhachHang(id);

-- THANH TOAN

GO
ALTER TABLE ThanhToan 
ADD CONSTRAINT PK_TT_HD
FOREIGN KEY (idHd) REFERENCES HoaDon(id);

-- KM

GO
ALTER TABLE KhuyenMai 
ADD CONSTRAINT PK_KM_LKM
FOREIGN KEY (idLoaiKm) REFERENCES LoaiKm(id);

-- Bảng DM_Dung_Chung
INSERT INTO DM_Dung_Chung (ma, ten, trangThai, giaTri)
VALUES ('DM001', N'Danh mục 1', 1, 'Giá trị danh mục 1'),
       ('DM002', N'Danh mục 2', 1, 'Giá trị danh mục 2');

-- Bảng HangSx
INSERT INTO HangSx (ten, trangThai)
VALUES (N'Hãng sản xuất 1', 1),
       (N'Hãng sản xuất 2', 1);

-- Bảng DanhMuc
INSERT INTO DanhMuc (ten, trangThai)
VALUES (N'Danh mục 1', 1),
       (N'Danh mục 2', 1);

-- Bảng MauSac
INSERT INTO MauSac (ten, trangThai)
VALUES (N'Màu sắc 1', 1),
       (N'Màu sắc 2', 1);

-- Bảng KichCo
INSERT INTO KichCo (ten, trangThai)
VALUES (N'Kích cỡ 1', 1),
       (N'Kích cỡ 2', 1);

-- Bảng VaiTro
INSERT INTO VaiTro (ten, trangThai)
VALUES (N'Vai trò 1', 1),
       (N'Vai trò 2', 1);

-- Bảng LichSu
INSERT INTO LichSu (moTa, trangThai, ngayNhap, nguoiNhap)
VALUES (N'Lịch sử 1', 1, '2023-11-06', 'Người nhập 1'),
       (N'Lịch sử 2', 1, '2023-11-06', 'Người nhập 2');

-- Bảng SanPham
INSERT INTO SanPham (maSanPham, ten)
VALUES (N'SP001', N'Sản phẩm 1'),
       (N'SP002', N'Sản phẩm 2');

-- Bảng SanPhamCt
INSERT INTO SanPhamCt (maSanPhamCt, idSp, giaNhap, giaBan, soLuong, moTa, trangThai, idHangSx, idKichCo, idMauSac, idDanhMuc)
VALUES (N'SPCT001', 1, 100, 200, 50, N'Mô tả sản phẩm 1', 1, 1, 1, 1, 1),
       (N'SPCT002', 2, 150, 250, 30, N'Mô tả sản phẩm 2', 1, 2, 2, 2, 2);
 
-- Bảng LoaiKm
INSERT INTO LoaiKm (ten, trangThai)
VALUES (N'Loại KM 1', 1),
       (N'Loại KM 2', 1);	  
	   
-- Bảng KhuyenMai
INSERT INTO KhuyenMai (ten, maGiamGia, giaTri, dieuKien, soLuong, ngayBatDau, ngayKetThuc, idLoaiKm)
VALUES (N'Khuyến mãi 1', 'KM001', 10.5, N'Điều kiện 1', 100, '2023-11-06', '2023-12-31', 1),
       (N'Khuyến mãi 2', 'KM002', 15.5, N'Điều kiện 2', 200, '2023-11-06', '2023-12-31', 2);

-- Bảng KhachHang
INSERT INTO KhachHang (ten, gioiTinh, sdt, diaChi)
VALUES (N'Khách hàng 1', 1, '0123456789', N'Địa chỉ 1'),
       (N'Khách hàng 2', 0, '0987654321', N'Địa chỉ 2');


-- Bảng NhanVien
INSERT INTO NhanVien (maNv, password, idVaiTro, ten, gioiTinh, email, phonenumber, diaChi, ngaySinh)
VALUES ('NV001', 'password1', 1, N'Nhân viên 1', 1, 'email1@example.com', '0123456789', N'Địa chỉ 1', '1990-01-01'),
       ('NV002', 'password2', 2, N'Nhân viên 2', 0, 'email2@example.com', '0987654321', N'Địa chỉ 2', '1995-05-05');

-- Bảng HoaDon
INSERT INTO HoaDon (maHd, idKachHang, idKm, idNV, ngayBan, tongTien, trangThai)
VALUES (N'HD001', 1, 1, 1, '2023-11-06', 250, 1),
       (N'HD002', 2, 2, 2, '2023-11-06', 400, 1);

-- Bảng HoaDonCt
INSERT INTO HoaDonCt (idHd, idSpCt, gia, soLuong, trangThai)
VALUES (3, NULL, 200, 2, 1),
       (4, NULL, 300, 3, 1);

-- Bảng ThanhToan
INSERT INTO ThanhToan (maThanhToan, idHd, type, name, value)
VALUES (N'TT001', 3, 'Payment 1', N'Thanh toán 1', N'Value 1'),
       (N'TT002', 4, 'Payment 2', N'Thanh toán 2', N'Value 2');