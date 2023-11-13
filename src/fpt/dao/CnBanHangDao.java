package fpt.dao;

import fpt.dto.HoaDonCtDto;
import fpt.dto.HoaDonDto;
import fpt.dto.SanPhamDto;
import fpt.enity.KhachHang;
import java.util.Date;
import java.util.List;

public class CnBanHangDao extends DaoHelper {

    public List<HoaDonDto> getHoaDon(int trangThai, Date dateForm, Date dateTo) {
        return excuesList(
                HoaDonDto.class,
                "{CALL cnbanHang_select_hoadon(?, ?, ?)}",
                trangThai,
                dateForm,
                dateTo
        );
    }

    public HoaDonDto getHoaDonById(String maHd) {
        return excuesObject(
                HoaDonDto.class,
                "{CALL cnbanHang_select_hoadon_byid(?)}",
                maHd
        );
    }

    public List<HoaDonCtDto> getHoaDonCtById(String maHd) {
        return excuesList(
                HoaDonCtDto.class,
                "{CALL cnbanHang_select_hoadonct_byid(?)}",
                maHd);
    }

    public HoaDonDto insertHoaDon(HoaDonDto object) {
        return excuesObject(
                HoaDonDto.class,
                "{CALL cnbanHang_create_hoadon (?, ?, ?, ?, ?, ?, ?) }",
                object.getMaHd(),
                object.getIdKh() == 0 ? null : object.getIdKh(),
                object.getIdKm(),
                object.getIdNv(),
                object.getNgayBan(),
                object.getTongTien(),
                object.getTrangThai()
        );
    }

    public KhachHang createKhachHang(String sdt, String tenKh) {
        return excuesObject(KhachHang.class,
                "{CALL cnbanHang_create_khachhang (?, ?) }",
                sdt,
                tenKh);
    }

    public KhachHang selectKhachHang(String sdt) {
        return excuesObject(KhachHang.class,
                "{CALL cnbanHang_select_khachhang (?) }",
                sdt);
    }

    public List<SanPhamDto> selectSanPham(String tuKhoa) {
        return excuesList(SanPhamDto.class,
                "{CALL cnbanHang_select_sanpham(?) }",
                tuKhoa);
    }

    public boolean insertOrUpdateHoDonCt(HoaDonCtDto object) {
        System.out.println(object.toString());
        return excuesInsertUpdateDelete(
                "{CALL cnbanHang_create_or_update_hoadonct(?, ?, ?, ?) }",
                object.getIdHd(),
                object.getIdSpCt(),
                object.getGia(),
                object.getSoLuong()
        );
    }

    public boolean updateTrangThaiHoaDon(int idHd, int trangThai) {
        return excuesInsertUpdateDelete(
                "{CALL cnbanHang_update_trangthai_hoadon(?, ?) }",
                idHd,
                trangThai
        );
    }
    
    public boolean updateSanPhamCt(int idSp, int soLuong) {
        return excuesInsertUpdateDelete(
                "{CALL cnbanHang_update_sanphamct(?, ?) }",
                idSp,
                soLuong
        );
    }
}
