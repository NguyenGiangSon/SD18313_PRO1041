package fpt.dto;

public class ViewsProductDto {
    private int id;
    private String maSanPham;
    private String tenSP;
    private float giaBan;
    private float giaNhap;
    private int danhMuc;
    private String danhMucText;
    private int hangSx;
    private String nhaSxText;
    private int kichCo;
    private String kichCoText;
    private int mauSac;
    private String mauSacText;
    private boolean trangThai;
    private int soLuong;
    private String moTa;
    private String maSanPhamCt;

    public ViewsProductDto() {
    }

    public ViewsProductDto(int id, String maSanPham, String tenSP, float giaBan, float giaNhap, int danhMuc, String danhMucText, int hangSx, String nhaSxText, int kichCo, String kichCoText, int mauSac, String mauSacText, boolean trangThai, int soLuong, String moTa) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.danhMuc = danhMuc;
        this.danhMucText = danhMucText;
        this.hangSx = hangSx;
        this.nhaSxText = nhaSxText;
        this.kichCo = kichCo;
        this.kichCoText = kichCoText;
        this.mauSac = mauSac;
        this.mauSacText = mauSacText;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public ViewsProductDto(int id, String maSanPham, String tenSP, float giaBan, float giaNhap, int danhMuc, String danhMucText, int hangSx, String nhaSxText, int kichCo, String kichCoText, int mauSac, String mauSacText, boolean trangThai, int soLuong, String moTa, String maSanPhamCt) {
        this.id = id;
        this.maSanPham = maSanPham;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.giaNhap = giaNhap;
        this.danhMuc = danhMuc;
        this.danhMucText = danhMucText;
        this.hangSx = hangSx;
        this.nhaSxText = nhaSxText;
        this.kichCo = kichCo;
        this.kichCoText = kichCoText;
        this.mauSac = mauSac;
        this.mauSacText = mauSacText;
        this.trangThai = trangThai;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.maSanPhamCt = maSanPhamCt;
    }

    public String getMaSanPhamCt() {
        return maSanPhamCt;
    }

    public void setMaSanPhamCt(String maSanPhamCt) {
        this.maSanPhamCt = maSanPhamCt;
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

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
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

    public int getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(int danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDanhMucText() {
        return danhMucText;
    }

    public void setDanhMucText(String danhMucText) {
        this.danhMucText = danhMucText;
    }

    public int getHangSx() {
        return hangSx;
    }

    public void setHangSx(int hangSx) {
        this.hangSx = hangSx;
    }

    public String getNhaSxText() {
        return nhaSxText;
    }

    public void setNhaSxText(String nhaSxText) {
        this.nhaSxText = nhaSxText;
    }

    public int getKichCo() {
        return kichCo;
    }

    public void setKichCo(int kichCo) {
        this.kichCo = kichCo;
    }

    public String getKichCoText() {
        return kichCoText;
    }

    public void setKichCoText(String kichCoText) {
        this.kichCoText = kichCoText;
    }

    public int getMauSac() {
        return mauSac;
    }

    public void setMauSac(int mauSac) {
        this.mauSac = mauSac;
    }

    public String getMauSacText() {
        return mauSacText;
    }

    public void setMauSacText(String mauSacText) {
        this.mauSacText = mauSacText;
    }

    public boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "ViewsProductDto{" + "id=" + id + ", maSanPham=" + maSanPham + ", tenSP=" + tenSP + ", giaBan=" + giaBan + ", giaNhap=" + giaNhap + ", danhMuc=" + danhMuc + ", danhMucText=" + danhMucText + ", hangSx=" + hangSx + ", nhaSxText=" + nhaSxText + ", kichCo=" + kichCo + ", kichCoText=" + kichCoText + ", mauSac=" + mauSac + ", mauSacText=" + mauSacText + ", trangThai=" + trangThai + ", soLuong=" + soLuong + ", mota=" + moTa + '}';
    }

    
}
