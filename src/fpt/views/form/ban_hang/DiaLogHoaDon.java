package fpt.views.form.ban_hang;

import fpt.dao.CnBanHangDao;
import fpt.dto.HoaDonCtDto;
import fpt.dto.HoaDonDto;
import fpt.enity.KhachHang;
import fpt.utils.MsgBox;

/**
 *
 * @author sonst
 */
public class DiaLogHoaDon extends javax.swing.JPanel {
    
    private CnBanHangDao cnBanHangDao = new CnBanHangDao();

    public DiaLogHoaDon(String maHd) {
        initComponents();
        setUp(maHd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHoDon = new fpt.views.swing.PanelBorder();
        lbMaHd = new javax.swing.JLabel();
        txtMaHd = new fpt.views.swing.my.MyTextFiled();
        lbNgayTao = new javax.swing.JLabel();
        txtNgayTao = new fpt.views.swing.my.MyTextFiled();
        lbTenNv = new javax.swing.JLabel();
        txtTenNv = new fpt.views.swing.my.MyTextFiled();
        lbTongTien = new javax.swing.JLabel();
        txtTongTien = new fpt.views.swing.my.MyTextFiled();
        txtThienKhachDua = new fpt.views.swing.my.MyTextFiled();
        lbTienKhachDua = new javax.swing.JLabel();
        txtTienThua = new fpt.views.swing.my.MyTextFiled();
        lbTienThua = new javax.swing.JLabel();
        btnThanhToan = new fpt.views.swing.my.MyButton();
        lbSdtKh = new javax.swing.JLabel();
        txtSdtKh = new fpt.views.swing.my.MyTextFiled();
        lbTenKh = new javax.swing.JLabel();
        txtTenKh = new fpt.views.swing.my.MyTextFiled();
        btnHuy = new fpt.views.swing.my.MyButton();

        panelHoDon.setForeground(new java.awt.Color(255, 255, 255));

        lbMaHd.setText("Mã hóa đơn");
        lbMaHd.setPreferredSize(new java.awt.Dimension(37, 25));

        txtMaHd.setEditable(false);
        txtMaHd.setPreferredSize(new java.awt.Dimension(85, 25));

        lbNgayTao.setText("Ngày tạo");
        lbNgayTao.setPreferredSize(new java.awt.Dimension(37, 25));

        txtNgayTao.setEditable(false);
        txtNgayTao.setPreferredSize(new java.awt.Dimension(85, 25));

        lbTenNv.setText("Tên nhân viên");
        lbTenNv.setPreferredSize(new java.awt.Dimension(37, 25));

        txtTenNv.setEditable(false);
        txtTenNv.setPreferredSize(new java.awt.Dimension(85, 25));

        lbTongTien.setText("Tổng tiền");
        lbTongTien.setPreferredSize(new java.awt.Dimension(37, 25));

        txtTongTien.setEditable(false);
        txtTongTien.setPreferredSize(new java.awt.Dimension(85, 25));

        txtThienKhachDua.setPreferredSize(new java.awt.Dimension(85, 25));
        txtThienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtThienKhachDuaKeyReleased(evt);
            }
        });

        lbTienKhachDua.setText("Tiền khách đưa");
        lbTienKhachDua.setPreferredSize(new java.awt.Dimension(37, 25));

        txtTienThua.setPreferredSize(new java.awt.Dimension(85, 25));

        lbTienThua.setText("Tiền thừa");
        lbTienThua.setPreferredSize(new java.awt.Dimension(37, 25));

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.setPreferredSize(new java.awt.Dimension(100, 30));
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        lbSdtKh.setText("Số điện thoại KH");
        lbSdtKh.setPreferredSize(new java.awt.Dimension(37, 25));

        txtSdtKh.setPreferredSize(new java.awt.Dimension(85, 25));
        txtSdtKh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSdtKhKeyReleased(evt);
            }
        });

        lbTenKh.setText("Tên KH");
        lbTenKh.setPreferredSize(new java.awt.Dimension(37, 25));

        txtTenKh.setPreferredSize(new java.awt.Dimension(85, 25));

        btnHuy.setText("Hủy hóa đơn");
        btnHuy.setPreferredSize(new java.awt.Dimension(100, 30));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHoDonLayout = new javax.swing.GroupLayout(panelHoDon);
        panelHoDon.setLayout(panelHoDonLayout);
        panelHoDonLayout.setHorizontalGroup(
            panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNv, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThienKhachDua, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbSdtKh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSdtKh, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKh, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelHoDonLayout.setVerticalGroup(
            panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHoDonLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSdtKh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSdtKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelHoDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelHoDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtThienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThienKhachDuaKeyReleased
        try {
            String tienKh = txtThienKhachDua.getText();
            if (tienKh.startsWith("0.0")) {
                txtThienKhachDua.setText(tienKh.replace("0.0", ""));
            }
            String tongTien = txtTongTien.getText();
            Float tienThua = Float.valueOf("0.0");
            if (!tienKh.isBlank()) {
                tienThua = Float.valueOf(tongTien) - Float.valueOf(tienKh);
            }
            txtTienThua.setText(tienThua + "");
        } catch (Exception e) {
            txtThienKhachDua.setText("0.0");
        }
    }//GEN-LAST:event_txtThienKhachDuaKeyReleased

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        String maHd = txtMaHd.getText();
        HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
        if (object == null) {
            MsgBox.alert(this, "Không thể thanh toán vì hóa đơn được tạo thành công");
        } else {
            // Nếu hóa đơn tồn tại bản ghi kiểm tra trạng thái thanh toán
            // trạng thái hồ sơ (1: đã thanh toán, 2 chờ thanh toán, 3 hủy)
            if (object.getTrangThai() != 2) {
                MsgBox.alert(this, "Hóa đơn " + object.getMaHd() + " đã ở trạng thanh thái " + object.getTrangThaiText());
                return;
            }
            boolean check = MsgBox.confirm(this, "Thanh toán ?");
            if (check) {
                cnBanHangDao.updateTrangThaiHoaDon(object.getId(), 1);
//                fillTableHoaDon(0);
//                clearForm();
                MsgBox.alert(this, "Thanh toán thành công!");
            }
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void txtSdtKhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSdtKhKeyReleased
        // TODO add your handling code here:
        KhachHang object = cnBanHangDao.selectKhachHang(txtSdtKh.getText());
        if (object != null) {
            txtTenKh.setText(object.getTen());
        } else {
            txtTenKh.setText("");
        }
    }//GEN-LAST:event_txtSdtKhKeyReleased

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        String maHd = txtMaHd.getText();
        HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
        if (object == null) {
            MsgBox.alert(this, "Không tồn tại hóa đơn " + maHd);
        } else {
            // Nếu hóa đơn tồn tại bản ghi kiểm tra trạng thái thanh toán
            // trạng thái hồ sơ (1: đã thanh toán, 2 chờ thanh toán, 3 hủy)
            if (object.getTrangThai() != 2) {
                MsgBox.alert(this, "Chỉ có thể hủy hóa đơn chờ");
                return;
            }
            boolean check = MsgBox.confirm(this, "Bạn có chắc chắn muốn hủy");
            if (check) {
                cnBanHangDao.updateTrangThaiHoaDon(object.getId(), 3);
//                fillTableHoaDon(0);
//                clearForm();
                MsgBox.alert(this, "Hủy hóa đơn thành công!");

                for (HoaDonCtDto h : cnBanHangDao.getHoaDonCtById(maHd)) {
                    cnBanHangDao.updateSanPhamCt(h.getIdSpCt(), h.getSoLuong());
                }
            }
        }
    }//GEN-LAST:event_btnHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnHuy;
    private fpt.views.swing.my.MyButton btnThanhToan;
    private javax.swing.JLabel lbMaHd;
    private javax.swing.JLabel lbNgayTao;
    private javax.swing.JLabel lbSdtKh;
    private javax.swing.JLabel lbTenKh;
    private javax.swing.JLabel lbTenNv;
    private javax.swing.JLabel lbTienKhachDua;
    private javax.swing.JLabel lbTienThua;
    private javax.swing.JLabel lbTongTien;
    private fpt.views.swing.PanelBorder panelHoDon;
    private fpt.views.swing.my.MyTextFiled txtMaHd;
    private fpt.views.swing.my.MyTextFiled txtNgayTao;
    private fpt.views.swing.my.MyTextFiled txtSdtKh;
    private fpt.views.swing.my.MyTextFiled txtTenKh;
    private fpt.views.swing.my.MyTextFiled txtTenNv;
    private fpt.views.swing.my.MyTextFiled txtThienKhachDua;
    private fpt.views.swing.my.MyTextFiled txtTienThua;
    private fpt.views.swing.my.MyTextFiled txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void setUp(String maHd) {
        txtMaHd.setText(maHd);
    }
}
