package fpt.enity;

public class DmAppParam {
    private int id;
    private String ma;
    private String ten;
    private Boolean trangThai;
    private String giaTri;

    public DmAppParam() {
    }

    public DmAppParam(int id, String ma, String ten, Boolean trangThai, String giaTri) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
        this.giaTri = giaTri;
    }

    public String getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(String giaTri) {
        this.giaTri = giaTri;
    }

    public DmAppParam(int id, String ma, String ten, Boolean trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Boolean getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return ten;
    } 
}
