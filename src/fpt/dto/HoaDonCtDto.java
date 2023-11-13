package fpt.dto;

import fpt.enity.HoaDonCt;

public class HoaDonCtDto extends HoaDonCt {

    private String maSp;
    private String tenSp;
    private int idSpCt;
    private float giaBan;
    private float giaNhap;
    private int id;
    private int idHd;
    private float gia;
    private int soLuong;
    private boolean trangThai;

    public String getTenSp() {
        return tenSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHd() {
        return idHd;
    }

    public void setIdHd(int idHd) {
        this.idHd = idHd;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getIdSpCt() {
        return idSpCt;
    }

    public void setIdSpCt(int idSpCt) {
        this.idSpCt = idSpCt;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getTongTen() {
        return this.gia * this.soLuong;
    }

    @Override
    public String toString() {
        return "HoaDonCtDto{" + "maSp=" + maSp + ", tenSp=" + tenSp + ", idSpCt=" + idSpCt + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", id=" + id + ", idHd=" + idHd + ", gia=" + gia + ", soLuong=" + soLuong + ", trangThai=" + trangThai + '}';
    }
}
