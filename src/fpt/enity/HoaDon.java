package fpt.enity;

import java.util.Date;

public class HoaDon {
    private int id;
    private String maHd;
    private int idKm;
    private int idKh;
    private int idNv;
    private Date ngayBan;
    private float tongTien;
    private int trangThai;
    private String trangThaiText;

    public HoaDon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaHd() {
        return maHd;
    }

    public void setMaHd(String maHd) {
        this.maHd = maHd;
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

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
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
