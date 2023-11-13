package fpt.enity;

import java.util.Date;

public class NhanVien {
    private int id;
    private String maNv;
    private String password;
    private int vaiTro;
    private String vaiTroText;
    private String ten;
    private boolean gioTinh;
    private String email;
    private String phonenumber;
    private String diaChi;
    private Date ngaySinh;
    private int idHinhAnh;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(int vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getVaiTroText() {
        return vaiTroText;
    }

    public void setVaiTroText(String vaiTroText) {
        this.vaiTroText = vaiTroText;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioTinh() {
        return gioTinh;
    }

    public void setGioTinh(boolean gioTinh) {
        this.gioTinh = gioTinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(int idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }
    
    
}
