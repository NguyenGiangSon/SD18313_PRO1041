package fpt.enity;

public class DanhMuc {
    private int id;
    private String ten;

    public DanhMuc(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public DanhMuc() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return getTen();
    }
}
