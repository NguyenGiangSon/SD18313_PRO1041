package fpt.dao;

import fpt.enity.DmAppParam;
import fpt.utils.BaseJdbcHelper;
import java.util.List;

public class DmAppParamDao extends DaoHelper {
  
    public static enum DM_PARAM {
        TRANG_THAI("TRANG_THAI", "Trạng thái");
        private String ma;
        private String ten;

        private DM_PARAM(String ma, String ten) {
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

    private final String SELECT_APP_PARAM = "select * from DmAppParam where ma = '%s' and trangThai > 0";

    public List<DmAppParam> getDmAppParam(DM_PARAM dm_param) {
        return excuesList(
                DmAppParam.class,
                String.format(SELECT_APP_PARAM, dm_param.getMa())
        );
    }
}
