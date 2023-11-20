package fpt.dto;

import java.text.DecimalFormat;
import java.util.Date;

public class HoaDonDto {
    private float tongTien;
    private float tienkhDua;
    private float tienThua;
    private String sdtKh;
    private String tenKh;
    private String maNV;
    private String tenNv;
    private int id;
    private String maHd;
    private int idKm;
    private int idKh;
    private int idNv;
    private Date ngayBan;
    private int trangThai;
    private String trangThaiText;

    public HoaDonDto() {

    }

    public HoaDonDto(float tongTien, float tienkhDua, float tienThua, String sdtKh, String tenKh, String maNV, String tenNv, int id, String maHd, int idKm, int idKh, int idNv, Date ngayBan, int trangThai) {
        this.tongTien = tongTien;
        this.tienkhDua = tienkhDua;
        this.tienThua = tienThua;
        this.sdtKh = sdtKh;
        this.tenKh = tenKh;
        this.maNV = maNV;
        this.tenNv = tenNv;
        this.id = id;
        this.maHd = maHd;
        this.idKm = idKm;
        this.idKh = idKh;
        this.idNv = idNv;
        this.ngayBan = ngayBan;
        this.trangThai = trangThai;
    }
    
    
    
    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public float getTongTien() {
        return tongTien;
    }
    
    public String getTongTienAsText() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedNumber = decimalFormat.format(getTongTien());

        return formattedNumber + " VNĐ";
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTienkhDua() {
        return tienkhDua;
    }

    public void setTienkhDua(float tienkhDua) {
        this.tienkhDua = tienkhDua;
    }

    public float getTienThua() {
        return tienThua;
    }

    public void setTienThua(float tienThua) {
        this.tienThua = tienThua;
    }

    public String getSdtKh() {
        return sdtKh;
    }

    public void setSdtKh(String sdtKh) {
        this.sdtKh = sdtKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKm() {
        return idKm;
    }

    public void setIdKm(int idKm) {
        this.idKm = idKm;
    }

    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    public int getIdNv() {
        return idNv;
    }

    public void setIdNv(int idNv) {
        this.idNv = idNv;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTrangThaiText() {
        return trangThaiText;
    }

    public void setTrangThaiText(String trangThaiText) {
        this.trangThaiText = trangThaiText;
    }

}
