package fpt.dao;

import fpt.dto.ViewsProductDto;
import java.util.List;

public class ViewsProductDao extends DaoHelper {

    public List<ViewsProductDto> getAll(ViewsProductDto v) {
        return excuesList(
                ViewsProductDto.class,
                "{CALL qlsp_search2(?, ?, ?, ?, ?, ?, ?)}",
                v.getMaSanPham(),
                v.getTenSP(),
                v.getTrangThai(),
                v.getHangSx(),
                v.getDanhMuc(),
                v.getKichCo(),
                v.getMauSac()
        );
    }

    public List<ViewsProductDto> getAll() {
        return excuesList(
                ViewsProductDto.class,
                "{CALL qlsp_search}"
        );
    }

    public boolean insert(ViewsProductDto object) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_insert_sp(?, ?)}",
                object.getMaSanPham(),
                object.getTenSP()
        );
    }

    public ViewsProductDto insert2(ViewsProductDto object) {
        return excuesInsertUpdateDeleteUseSp(
                ViewsProductDto.class,
                "{CALL qlsp_insert_sp(?, ?)}",
                object.getMaSanPham(),
                object.getTenSP()
        );
    }

    public boolean insertSpCt(String maSp, ViewsProductDto object) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_insert_spct(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}",
                maSp,
                object.getId(),
                object.getGiaBan(),
                object.getGiaNhap(),
                object.getSoLuong(),
                object.getMoTa(),
                object.getTrangThai(),
                object.getHangSx(),
                object.getKichCo(),
                object.getMauSac(),
                object.getDanhMuc(),
                null
        );
    }

    public boolean deleteProduct(String maSp) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_delete_SanPham(?)}",
                maSp
        );
    }

    public boolean deleteProductCt(String maSp) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_delete_SanPhamCt(?)}",
                maSp
        );
    }
    
    // update trang thai hoat dong
    public boolean updateStatusProductCt(String maSp) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_update_status_sp(?)}",
                maSp
        );
    }

    // chuyển trạng thái về ngững hoạt động
    public boolean deleteProduct2(String maSp) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_delete_SanPham(?)}",
                maSp
        );
    }

    public List<ViewsProductDto> checkExists(String maSp) {
        return excuesList(
                ViewsProductDto.class,
                "Select maSanPham from sanPham where maSanPham like ?",
                maSp
        );
    }

    public List<ViewsProductDto> checkSpctExists(String maSpCt) {
        return excuesList(
                ViewsProductDto.class,
                "Select maSanPhamCt from sanPhamCt where maSanPhamCt like ?",
                maSpCt
        );
    }

    public boolean updateProduct(ViewsProductDto object) {
        return excuesInsertUpdateDelete(
                "{CALL qlsp_update_SanPham(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}",
                object.getMaSanPham(),
                object.getMaSanPhamCt(),
                object.getTenSP(),
                object.getGiaBan(),
                object.getGiaNhap(),
                object.getSoLuong(),
                object.getTrangThai(),
                object.getMoTa(),
                object.getMauSac(),
                object.getDanhMuc(),
                object.getKichCo(),
                object.getHangSx(),
                null
        );
    }

    public ViewsProductDto getById(String maSp) {
        return excuesList(
                ViewsProductDto.class,
                "{CALL qlsp_select_by_id(?)}",
                maSp).get(0);
    }

    public ViewsProductDto getSpCtById(String maSp, String maSpCt) {
        return excuesObject(
                ViewsProductDto.class,
                "{CALL qlsp_select_spct_by_id(?, ?)}",
                maSp, maSpCt);
    }

    public ViewsProductDto getById2(String maSp) {
        return excuesObject(
                ViewsProductDto.class,
                "{CALL qlsp_select_by_id(?)}",
                maSp);
    }
}
