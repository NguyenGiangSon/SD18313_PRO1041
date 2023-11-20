package fpt.views.form.ban_hang;

import fpt.dao.CnBanHangDao;
import fpt.dto.HoaDonCtDto;
import fpt.dto.HoaDonDto;
import fpt.dto.SanPhamDto;
import fpt.utils.MsgBox;
import fpt.utils.UserSession;
import fpt.utils.XFastFuntion;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ViewsBanHang2 extends javax.swing.JPanel {

    private CnBanHangDao cnBanHangDao = new CnBanHangDao();

    private DefaultTableModel tblModelHd;

    private DefaultTableModel tblModelGioHang;

    private DefaultTableModel tblModelSp;

    public ViewsBanHang2() {
        initComponents();
        setup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder2 = new fpt.views.swing.PanelBorder();
        panelDsHang = new fpt.views.swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        txtSearchSp = new fpt.views.swing.my.MyTextFiled();
        jLabel1 = new javax.swing.JLabel();
        panelGioHang = new fpt.views.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        panelGioHang1 = new fpt.views.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        panelShowHd = new fpt.views.swing.PanelBorder();
        txtShowMaHd = new fpt.views.swing.my.MyTextFiled();
        jLabel2 = new javax.swing.JLabel();
        btnThanhToan = new fpt.views.swing.my.MyButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtShowTongTien = new fpt.views.swing.my.MyTextFiled();
        btnAddHd = new fpt.views.swing.my.MyButton();

        setPreferredSize(new java.awt.Dimension(919, 488));

        panelBorder2.setForeground(new java.awt.Color(255, 255, 255));

        panelDsHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelDsHang.setForeground(new java.awt.Color(255, 255, 255));

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Giá tiền", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSanPham);
        if (tableSanPham.getColumnModel().getColumnCount() > 0) {
            tableSanPham.getColumnModel().getColumn(0).setMaxWidth(35);
        }

        txtSearchSp.setPreferredSize(new java.awt.Dimension(64, 25));
        txtSearchSp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchSpKeyReleased(evt);
            }
        });

        jLabel1.setText("Nhập mã hoặc tên sản phẩm");

        javax.swing.GroupLayout panelDsHangLayout = new javax.swing.GroupLayout(panelDsHang);
        panelDsHang.setLayout(panelDsHangLayout);
        panelDsHangLayout.setHorizontalGroup(
            panelDsHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panelDsHangLayout.createSequentialGroup()
                .addGroup(panelDsHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearchSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDsHangLayout.setVerticalGroup(
            panelDsHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDsHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGioHang.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelGioHang.setForeground(new java.awt.Color(255, 255, 255));

        tableHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã HĐ", "Ngày tạo", "Tên NV", "Thao tác"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
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

        javax.swing.GroupLayout panelGioHangLayout = new javax.swing.GroupLayout(panelGioHang);
        panelGioHang.setLayout(panelGioHangLayout);
        panelGioHangLayout.setHorizontalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelGioHangLayout.setVerticalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGioHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        panelGioHang1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Giỏ hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        panelGioHang1.setForeground(new java.awt.Color(255, 255, 255));
        panelGioHang1.setPreferredSize(new java.awt.Dimension(500, 260));

        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblGioHang);

        javax.swing.GroupLayout panelGioHang1Layout = new javax.swing.GroupLayout(panelGioHang1);
        panelGioHang1.setLayout(panelGioHang1Layout);
        panelGioHang1Layout.setHorizontalGroup(
            panelGioHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        panelGioHang1Layout.setVerticalGroup(
            panelGioHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGioHang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
        );

        panelShowHd.setForeground(new java.awt.Color(255, 255, 255));

        txtShowMaHd.setEditable(false);
        txtShowMaHd.setMinimumSize(new java.awt.Dimension(64, 25));
        txtShowMaHd.setPreferredSize(new java.awt.Dimension(85, 25));

        jLabel2.setText("Mã HĐ");
        jLabel2.setPreferredSize(new java.awt.Dimension(37, 25));

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        jLabel3.setText("Tổng tiền");
        jLabel3.setPreferredSize(new java.awt.Dimension(37, 25));

        txtShowTongTien.setEditable(false);
        txtShowTongTien.setMinimumSize(new java.awt.Dimension(64, 25));
        txtShowTongTien.setPreferredSize(new java.awt.Dimension(85, 25));

        btnAddHd.setText("Hóa đơn mới");
        btnAddHd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShowHdLayout = new javax.swing.GroupLayout(panelShowHd);
        panelShowHd.setLayout(panelShowHdLayout);
        panelShowHdLayout.setHorizontalGroup(
            panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowHdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShowHdLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtShowMaHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator1)
                    .addGroup(panelShowHdLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtShowTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowHdLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelShowHdLayout.setVerticalGroup(
            panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowHdLayout.createSequentialGroup()
                .addGroup(panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtShowTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panelShowHdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelShowHdLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddHd, btnThanhToan});

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDsHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelShowHd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGioHang1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addComponent(panelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelShowHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDsHang, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(panelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelGioHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        int selected = tableHoaDon.getSelectedRow();
        HoaDonDto object = cnBanHangDao.getHoaDonById(tblModelHd.getValueAt(selected, 1).toString());
//        setFormHoaDon(object);
        txtShowMaHd.setText(object.getMaHd());
        txtShowTongTien.setText(object.getTongTienAsText());
        fillTableGiohang(tblModelHd.getValueAt(selected, 1).toString());
    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void txtSearchSpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchSpKeyReleased
        // TODO add your handling code here:
        fillTableSanPham(txtSearchSp.getText());
    }//GEN-LAST:event_txtSearchSpKeyReleased

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        // lấy vị trí và thông số cần
        int index = tableSanPham.getSelectedRow();
        String maSp = tblModelSp.getValueAt(index, 1).toString();
        String giaBan = tblModelSp.getValueAt(index, 3).toString();
        String soLuong = tblModelSp.getValueAt(index, 3).toString();

        SanPhamDto sp = cnBanHangDao.getSanPhamByMaSp(tblModelSp.getValueAt(index, 1).toString());
        if (sp.getSoLuong() < 1) {
            MsgBox.alert(this, "Số lượng hàng hiện tại không đủ!");
            return;
        }

        // thêm mới vào hóa đơn chi tiết
        String maHd = txtShowMaHd.getText();
        HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);

        // nếu hóa đơn chưa tồn tại tạo mới hóa đơn ở trạng thái chờ
        if (object == null) {
            MsgBox.alert(this, "Tạo mới hóa đơn để thêm sản phẩm!");
            return;
        }
        HoaDonCtDto hdCtDto = new HoaDonCtDto();
        hdCtDto.setIdHd(object.getId());
        hdCtDto.setIdSpCt(sp.getId());
        hdCtDto.setGia(sp.getGiaBan());
        hdCtDto.setSoLuong(1);

        boolean check = cnBanHangDao.insertOrUpdateHoDonCt(hdCtDto);
        if (check) {
            MsgBox.alert(this, "Thêm giỏ hàng thành công!");
        } else {
            MsgBox.alert(this, "Thêm giỏ hàng thất bại!");
        }
        fillTableSanPham("");
        fillTableGiohang(maHd);
        updateFormThanhToan(maHd);
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void btnAddHdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHdActionPerformed
        if (MsgBox.confirm(this, "Tạo mới hóa đơn?")) {
            txtShowMaHd.setText(XFastFuntion.createCode());
            txtShowTongTien.setText("0 VNĐ");

            String maHd = txtShowMaHd.getText();
            HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
            // nếu hóa đơn chưa tồn tại tạo mới hóa đơn ở trạng thái chờ
            if (object == null) {
                HoaDonDto hoaDonDto = getFormHoaDon();
                if (hoaDonDto != null) {
                    cnBanHangDao.insertHoaDon(hoaDonDto);
                    fillTableHoaDon(getIntCbHoaDon());
                    MsgBox.alert(this, "Hóa đơn được tạo thành công và đang ở trạng thái chờ");
                }
            }
        }
    }//GEN-LAST:event_btnAddHdActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        afterShowDialogThanhToan();
    }//GEN-LAST:event_btnThanhToanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnAddHd;
    private fpt.views.swing.my.MyButton btnThanhToan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private fpt.views.swing.PanelBorder panelBorder2;
    private fpt.views.swing.PanelBorder panelDsHang;
    private fpt.views.swing.PanelBorder panelGioHang;
    private fpt.views.swing.PanelBorder panelGioHang1;
    private fpt.views.swing.PanelBorder panelShowHd;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTable tblGioHang;
    private fpt.views.swing.my.MyTextFiled txtSearchSp;
    private fpt.views.swing.my.MyTextFiled txtShowMaHd;
    private fpt.views.swing.my.MyTextFiled txtShowTongTien;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        // cập nhật form hóa đơn
//        HoaDonDto hdd = new HoaDonDto();
//        hdd.setMaHd(XFastFuntion.createCode());
//        hdd.setNgayBan(new Date());
//        hdd.setTenNv(UserSession.getInstance().getName());
//        hdd.setMaNV(UserSession.getInstance().getMaNv());
//        setFormHoaDon(hdd);

        // Đổ dữ liệu cho bảng hóa đơn
        tblModelHd = (DefaultTableModel) tableHoaDon.getModel();
        fillTableHoaDon(getIntCbHoaDon());
        // tạo popup menu
        setRowPopUpHoaDon();
        // Tạo poup cho giỏ hàng
        setRowPopUpGioHang();
        // Đổ dữ liệu cho bảng sản phẩm
        tblModelSp = (DefaultTableModel) tableSanPham.getModel();
        fillTableSanPham("");

        tblModelGioHang = (DefaultTableModel) tblGioHang.getModel();
    }

    private void setRowPopUpHoaDon() {
        JPopupMenu rowMenu = new JPopupMenu();
        JMenuItem thanhToan = new JMenuItem("Thanh toán");
        JMenuItem huyThanhToan = new JMenuItem("Hủy thanh toán");
        rowMenu.add(thanhToan);
        rowMenu.add(huyThanhToan);

        thanhToan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Thanh toans " + tableHoaDon.getSelectedRow() + " - " + tableHoaDon.getValueAt(tableHoaDon.getSelectedRow(), 1));
                int index = tableHoaDon.getSelectedRow();
                String maHd;
                if (index < 0) {
                    maHd = txtShowMaHd.getText();
                } else {
                    maHd = tblModelHd.getValueAt(index, 1).toString();
                }
                if (maHd.isBlank()) {
                    MsgBox.alert(panelBorder2, "Chọn hóa đơn để thanh toán");
                    return;
                }
                HoaDonDto hoaDon = cnBanHangDao.getHoaDonById(maHd);
                if (hoaDon == null) {
                    MsgBox.alert(panelBorder2, "Hóa đơn không tồn tại");
                    return;
                }
                showDialogThanhToan(maHd);
            }
        });

        huyThanhToan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Huy thanh toans " + tableHoaDon.getSelectedRow() + " - " + tableHoaDon.getValueAt(tableHoaDon.getSelectedRow(), 1));
            }
        });

        tableHoaDon.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    tableHoaDon.setRowSelectionInterval(tableHoaDon.rowAtPoint(e.getPoint()), tableHoaDon.rowAtPoint(e.getPoint()));
                    rowMenu.show(tableHoaDon, e.getX(), e.getY());
                }
            }
        });
    }

    private void setRowPopUpGioHang() {
        JPopupMenu rowMenu = new JPopupMenu();
        JMenuItem suaSoLuong = new JMenuItem("Sửa số lượng");
        JMenuItem xoaKhoiGiohang = new JMenuItem("Xóa khỏi giỏ hàng");
        rowMenu.add(suaSoLuong);
        rowMenu.add(new JSeparator());
        rowMenu.add(xoaKhoiGiohang);

        suaSoLuong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afterShowDialogThanhToan();
            }
        });

        xoaKhoiGiohang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Huy thanh toans " + tableHoaDon.getSelectedRow() + " - " + tableHoaDon.getValueAt(tableHoaDon.getSelectedRow(), 1));
            }
        });

        tblGioHang.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    tblGioHang.setRowSelectionInterval(tblGioHang.rowAtPoint(e.getPoint()), tblGioHang.rowAtPoint(e.getPoint()));
                    rowMenu.show(tblGioHang, e.getX(), e.getY());
                }
            }
        });
    }

    // lấy trạng thái tìm kiếm của danh sách hóa đơn(2: hóa đơn chờ)
    private int getIntCbHoaDon() {
        return 2;
    }

    private void setFormHoaDon(HoaDonDto object) {
//        txtMaHd.setText(object.getMaHd());
//        txtNgayTao.setText(XDate.toString(object.getNgayBan()));
//        txtTenNv.setText(object.getTenNv());
//        txtTongTien.setText(object.getTongTien() + "");
//        txtThienKhachDua.setText(object.getTienkhDua() + "");
//        txtTienThua.setText(object.getTienThua() + "");
//        txtSdtKh.setText(object.getSdtKh());
//        txtTenKh.setText(object.getTenKh());
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

    private void clearForm() {
//        txtMaHd.setText(XFastFuntion.createCode());
//        txtNgayTao.setText(XDate.toString(new Date()));
//        txtTenNv.setText(UserSession.getInstance().getName());
//        txtTongTien.setText("0.0");
//        txtThienKhachDua.setText("0.0");
//        txtTienThua.setText("0.0");
//        txtSdtKh.setText("");
//        txtTenKh.setText("");
        tblModelGioHang.setRowCount(0);
        tblModelGioHang.setRowCount(0);
//        btnHuy.setVisible(false);
    }

    private HoaDonDto getFormHoaDon() {
        try {
            String maHd = txtShowMaHd.getText();
            Date ngayTao = new Date();
            String tenNv = UserSession.getInstance().getName();
            String maNv = UserSession.getInstance().getMaNv();
            Float tongTien = Float.valueOf("0");
            Float tienKhachDua = Float.valueOf("0");
            Float tienThua = Float.valueOf("0");
            HoaDonDto object = new HoaDonDto(tongTien, tienKhachDua, tienThua, "", "", maNv, tenNv, 0, maHd, 0, 0, UserSession.getInstance().getId(), ngayTao, 2);
            return object;
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
        return null;
    }

    private void createHoaDon() {
//        String maHd = txtMaHd.getText();
//        HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
//        // nếu hóa đơn chưa tồn tại tạo mới hóa đơn ở trạng thái chờ
//        if (object == null) {
//            HoaDonDto hoaDonDto = getFormHoaDon();
//            if (hoaDonDto != null) {
//                cnBanHangDao.insertHoaDon(hoaDonDto);
//                fillTableHoaDon(getIntCbHoaDon());
//                MsgBox.alert(this, "Hóa đơn được tạo thành công và đang ở trạng thái chờ");
//                btnHuy.setVisible(true);
//            }
//        } else {
//            // Nếu hóa đơn tồn tại bản ghi kiểm tra trạng thái thanh toán
//            // trạng thái hồ sơ (1: đã thanh toán, 2 chờ thanh toán, 3 hủy)
//            if (object.getTrangThai() != 2) {
//                MsgBox.alert(this, "Hóa đơn " + object.getMaHd() + " đã ở trạng thanh thái " + object.getTrangThaiText());
//                return;
//            }
//            boolean check = MsgBox.confirm(this, "Hóa đơn chưa được thanh toán! chuyển về trạng thái chờ?");
//            if (check) {
//                MsgBox.alert(this, "check");
//                clearForm();
//            }
//        }
    }

    private void updateFormThanhToan(String maHd) {
        float tongTien = 0;
        for (HoaDonCtDto object : cnBanHangDao.getHoaDonCtById(maHd)) {
            tongTien += object.getTongTen();
        }
//        txtTongTien.setText(tongTien + "");
    }

    private void afterShowDialogThanhToan() {
        int index = tableHoaDon.getSelectedRow();
        String maHd;
        if (index < 0) {
            maHd = txtShowMaHd.getText();
        } else {
            maHd = tblModelHd.getValueAt(index, 1).toString();
        }
        if (maHd.isBlank()) {
            MsgBox.alert(panelBorder2, "Chọn hóa đơn để thanh toán");
            return;
        }
        HoaDonDto hoaDon = cnBanHangDao.getHoaDonById(maHd);
        if (hoaDon == null) {
            MsgBox.alert(panelBorder2, "Hóa đơn không tồn tại");
            return;
        }
        showDialogThanhToan(maHd);
    }

    private void showDialogThanhToan(String maHd) {
        JDialog jDialog = new JDialog();
        DiaLogHoaDon diaLogHoaDon = new DiaLogHoaDon(maHd);
        jDialog = new JDialog();
        jDialog.setTitle("Hóa đơn");
        jDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        jDialog.setSize(400, 430);
        jDialog.setResizable(false);
        jDialog.add(diaLogHoaDon);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }
}
