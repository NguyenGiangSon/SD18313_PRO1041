package fpt.views.form.ban_hang;

import fpt.dao.CnBanHangDao;
import fpt.dto.HoaDonCtDto;
import fpt.dto.HoaDonDto;
import fpt.dto.SanPhamDto;
import fpt.utils.UserSession;
import fpt.utils.XFastFuntion;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ViewsHoaDon extends javax.swing.JPanel {

    private CnBanHangDao cnBanHangDao = new CnBanHangDao();

    private DefaultTableModel tblModelHd;

    private DefaultTableModel tblModelGioHang;

    private DefaultTableModel tblModelSp;

    public ViewsHoaDon() {
        initComponents();
//        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder1 = new fpt.views.swing.PanelBorder();
        panelGioHang = new fpt.views.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jrAll = new javax.swing.JRadioButton();
        jrDaHt = new javax.swing.JRadioButton();
        jrChuaHt = new javax.swing.JRadioButton();
        jrHuy = new javax.swing.JRadioButton();

        setPreferredSize(new java.awt.Dimension(919, 488));

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(919, 488));

        panelGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelGioHang.setForeground(new java.awt.Color(255, 255, 255));

        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HĐ", "Ngày tạo", "Tên NV", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableHoaDon);

        buttonGroup1.add(jrAll);
        jrAll.setSelected(true);
        jrAll.setText("Tất cả");
        jrAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrAllMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrDaHt);
        jrDaHt.setText("Đã thanh toán");
        jrDaHt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrDaHtMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrChuaHt);
        jrChuaHt.setText("Chờ thanh toán");
        jrChuaHt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrChuaHtMouseClicked(evt);
            }
        });

        buttonGroup1.add(jrHuy);
        jrHuy.setText("Đã hủy");
        jrHuy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrHuyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelGioHangLayout = new javax.swing.GroupLayout(panelGioHang);
        panelGioHang.setLayout(panelGioHangLayout);
        panelGioHangLayout.setHorizontalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGioHangLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrAll, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrDaHt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrChuaHt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelGioHangLayout.setVerticalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGioHangLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAll)
                    .addComponent(jrDaHt)
                    .addComponent(jrChuaHt)
                    .addComponent(jrHuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jrHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrHuyMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrHuyMouseClicked

    private void jrChuaHtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrChuaHtMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrChuaHtMouseClicked

    private void jrDaHtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrDaHtMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrDaHtMouseClicked

    private void jrAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrAllMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrAllMouseClicked

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        int selected = tableHoaDon.getSelectedRow();
        HoaDonDto object = cnBanHangDao.getHoaDonById(tblModelHd.getValueAt(selected, 1).toString());
        fillTableGiohang(tblModelHd.getValueAt(selected, 1).toString());
    }//GEN-LAST:event_tableHoaDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jrAll;
    private javax.swing.JRadioButton jrChuaHt;
    private javax.swing.JRadioButton jrDaHt;
    private javax.swing.JRadioButton jrHuy;
    private fpt.views.swing.PanelBorder panelBorder1;
    private fpt.views.swing.PanelBorder panelGioHang;
    private javax.swing.JTable tableHoaDon;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        HoaDonDto hdd = new HoaDonDto();
        hdd.setMaHd(XFastFuntion.createCode());
        hdd.setNgayBan(new Date());
        hdd.setTenNv(UserSession.getInstance().getName());
        hdd.setMaNV(UserSession.getInstance().getMaNv());
        tblModelHd = (DefaultTableModel) tableHoaDon.getModel();
        fillTableHoaDon(getIntCbHoaDon());
        fillTableSanPham("");
        //
    }


    private void fillTableHoaDon(int trangThai) {
        tblModelHd.setRowCount(0);
        int index = 0;
        for (HoaDonDto object : cnBanHangDao.getHoaDon(trangThai, null, null)) {
            tblModelHd.addRow(new Object[]{
                ++index, object.getMaHd(), object.getNgayBan(), object.getTenNv(), object.getTrangThaiText()
            }
            );
        }
    }

    private void fillTableSanPham(String tuKhoa) {
        tblModelSp.setRowCount(0);
        int index = 0;
        for (SanPhamDto object : cnBanHangDao.selectSanPham(tuKhoa)) {
            tblModelSp.addRow(new Object[]{
                ++index, object.getMaSp(), object.getTenSp(), object.getGiaBan(), object.getGiaNhap(), object.getSoLuong()
            }
            );
        }
    }

    private void fillTableGiohang(String maHd) {
        tblModelGioHang.setRowCount(0);
        int index = 0;
        for (HoaDonCtDto object : cnBanHangDao.getHoaDonCtById(maHd)) {
            tblModelGioHang.addRow(new Object[]{
                ++index, object.getMaSp(), object.getTenSp(), object.getSoLuong(), object.getGia(), object.getTongTen()
            }
            );
        }
    }

    // lấy trạng thái tìm kiếm của danh sách hóa đơn
    private int getIntCbHoaDon() {
        if (jrHuy.isSelected()) {
            return 3;
        }
        if (jrDaHt.isSelected()) {
            return 1;
        }
        if (jrChuaHt.isSelected()) {
            return 2;
        }
        return 0;
    }

    private void clearForm() {
        tblModelGioHang.setRowCount(0);
        tblModelGioHang.setRowCount(0);
    }

    private HoaDonDto getFormHoaDon() {
            Date ngayTao = new Date();
            String tenNv = UserSession.getInstance().getName();
            String maNv = UserSession.getInstance().getMaNv();
            String tenKh = "";
        return null;
    }
}
