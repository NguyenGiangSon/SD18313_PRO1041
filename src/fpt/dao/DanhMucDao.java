package fpt.dao;

import fpt.enity.DanhMuc;
import java.util.List;

public class DanhMucDao extends DaoHelper{

    public static enum DANH_MUC {
        DANH_MUC("DanhMuc", "Danh mục"),
        MAU_SAC("MauSac", "Màu sắc"),
        NHA_SX("HangSx", "Nhà sản xuất"),
        KICH_CO("KichCo", "Kích cỡ");
        private String ma;
        private String ten;

        private DANH_MUC(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
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
    }
    
    private final String SELECT_DANH_MUC = "select id, ten from %s where trangThai > 0";
    
    public List<DanhMuc> getDanhMuc(DANH_MUC danh_muc) {
        return excuesList(DanhMuc.class, String.format(SELECT_DANH_MUC, danh_muc.getMa()));
    }
}
