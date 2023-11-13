package fpt.enity;

import java.util.Date;

public class SanPham {

    private int id;
    private String maSanPham;
    private String ten;

    public SanPham() {
    }

    public SanPham(int id, String maSanPham, String ten) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", maSanPham=" + maSanPham + ", ten=" + ten + '}';
    }

    
}
