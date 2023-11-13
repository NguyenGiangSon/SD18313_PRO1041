package fpt.dao;

import fpt.enity.SanPham;
import fpt.utils.BaseJdbcHelper;
import java.util.List;

public class SanPhamDao extends BaseJdbcHelper<SanPham, Integer> {

    private final String SELECT_ALL = "select * from SanPham";

    public SanPhamDao() {
        super(SanPham.class);
    }

    public List<SanPham> getAll() {
        return excuesList(SELECT_ALL);
    }
}
