package fpt.service;

import fpt.dao.CnBanHangDao;
import fpt.dto.HoaDonDto;
import fpt.enity.HoaDon;
import java.util.ArrayList;
import java.util.List;

public class CnBanHangSerice {
    
    private CnBanHangDao banHangDao = new CnBanHangDao();
    
//    public List<HoaDonDto> getAllHoaDon() {
//        List<HoaDonDto> lst = new ArrayList<>();
//        for (HoaDon hoaDon : banHangDao.getHoaDon()) {
//            HoaDonDto object = new HoaDonDto();
//            object.setHoaDon(hoaDon);
//            lst.add(object);
//        }
//        return lst;
//    }
}
