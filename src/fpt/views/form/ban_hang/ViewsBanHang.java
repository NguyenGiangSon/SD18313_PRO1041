package fpt.views.form.ban_hang;

import fpt.dao.CnBanHangDao;
import fpt.dto.HoaDonCtDto;
import fpt.dto.HoaDonDto;
import fpt.dto.SanPhamDto;
import fpt.enity.KhachHang;
import fpt.utils.MsgBox;
import fpt.utils.UserSession;
import fpt.utils.ValidateEx;
import fpt.utils.XDate;
import fpt.utils.XFastFuntion;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class ViewsBanHang extends javax.swing.JPanel {

    private CnBanHangDao cnBanHangDao = new CnBanHangDao();

    private DefaultTableModel tblModelHd;

    private DefaultTableModel tblModelGioHang;

    private DefaultTableModel tblModelSp;

    public ViewsBanHang() {
        initComponents();
        setup();
//        txtSdtKh.getDocument().addDocumentListener(new DocumentListener() {
//            
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panelBorder1 = new fpt.views.swing.PanelBorder();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelBorder2 = new fpt.views.swing.PanelBorder();
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
        btnCreateHd = new fpt.views.swing.my.MyButton();
        lbSdtKh = new javax.swing.JLabel();
        txtSdtKh = new fpt.views.swing.my.MyTextFiled();
        lbTenKh = new javax.swing.JLabel();
        txtTenKh = new fpt.views.swing.my.MyTextFiled();
        btnHuy = new fpt.views.swing.my.MyButton();
        btnClearForm = new fpt.views.swing.my.MyButton();
        panelGioHang = new fpt.views.swing.PanelBorder();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHoaDon = new javax.swing.JTable();
        jrAll = new javax.swing.JRadioButton();
        jrDaHt = new javax.swing.JRadioButton();
        jrChuaHt = new javax.swing.JRadioButton();
        jrHuy = new javax.swing.JRadioButton();
        panelGioHang1 = new fpt.views.swing.PanelBorder();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        panelBorder4 = new fpt.views.swing.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        txtSearchSp = new fpt.views.swing.my.MyTextFiled();
        jLabel1 = new javax.swing.JLabel();
        txtMaSpAdd = new fpt.views.swing.my.MyTextFiled();
        txtSoLuongAdd = new fpt.views.swing.my.MyTextFiled();
        lbsoLuongThem = new javax.swing.JLabel();
        btnAddSp = new fpt.views.swing.my.MyButton();

        setPreferredSize(new java.awt.Dimension(919, 488));

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(919, 488));

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelBorder2.setForeground(new java.awt.Color(255, 255, 255));

        panelHoDon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
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
        btnThanhToan.setPreferredSize(new java.awt.Dimension(100, 40));
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnCreateHd.setText("Tạo hóa đơn");
        btnCreateHd.setPreferredSize(new java.awt.Dimension(100, 40));
        btnCreateHd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHdActionPerformed(evt);
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
        btnHuy.setPreferredSize(new java.awt.Dimension(100, 40));
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnClearForm.setText("Hóa đơn mới");
        btnClearForm.setPreferredSize(new java.awt.Dimension(100, 40));
        btnClearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHoDonLayout = new javax.swing.GroupLayout(panelHoDon);
        panelHoDon.setLayout(panelHoDonLayout);
        panelHoDonLayout.setHorizontalGroup(
            panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHoDonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbMaHd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaHd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTenNv, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNv, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTienKhachDua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThienKhachDua, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTienThua, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTienThua, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbSdtKh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSdtKh, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(lbTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKh, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                    .addGroup(panelHoDonLayout.createSequentialGroup()
                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCreateHd, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearForm, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelHoDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateHd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

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
                .addComponent(jrAll, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrDaHt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrChuaHt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrHuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        panelGioHangLayout.setVerticalGroup(
            panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGioHangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGioHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAll)
                    .addComponent(jrDaHt)
                    .addComponent(jrChuaHt)
                    .addComponent(jrHuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
        );
        panelGioHang1Layout.setVerticalGroup(
            panelGioHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGioHang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHoDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGioHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGioHang1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelGioHang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(panelHoDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelGioHang, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Hóa đơn", panelBorder2);

        panelBorder4.setForeground(new java.awt.Color(255, 255, 255));

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Giá tiền", "Giá nhập", "Số lượng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        txtSearchSp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchSpKeyReleased(evt);
            }
        });

        jLabel1.setText("Mã sản phẩm");
        jLabel1.setPreferredSize(new java.awt.Dimension(37, 22));

        txtMaSpAdd.setEnabled(false);

        txtSoLuongAdd.setText("1");

        lbsoLuongThem.setText("Số lượng");
        lbsoLuongThem.setPreferredSize(new java.awt.Dimension(37, 22));

        btnAddSp.setText("Thêm");
        btnAddSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 895, Short.MAX_VALUE)
                    .addGroup(panelBorder4Layout.createSequentialGroup()
                        .addComponent(txtSearchSp, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaSpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbsoLuongThem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoLuongAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddSp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtSearchSp, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtMaSpAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoLuongAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbsoLuongThem, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnAddSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBorder4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddSp, jLabel1, txtMaSpAdd, txtSoLuongAdd});

        jTabbedPane1.addTab("Sản phẩm", panelBorder4);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
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

    private void tableHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHoaDonMouseClicked
        int selected = tableHoaDon.getSelectedRow();
        HoaDonDto object = cnBanHangDao.getHoaDonById(tblModelHd.getValueAt(selected, 1).toString());
        setFormHoaDon(object);
        fillTableGiohang(tblModelHd.getValueAt(selected, 1).toString());
        if (object.getTrangThai() == 2) {
            btnHuy.setVisible(true);
        } else {
            btnHuy.setVisible(false);
        }
    }//GEN-LAST:event_tableHoaDonMouseClicked

    private void jrAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrAllMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrAllMouseClicked

    private void jrDaHtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrDaHtMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrDaHtMouseClicked

    private void jrChuaHtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrChuaHtMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrChuaHtMouseClicked

    private void jrHuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrHuyMouseClicked
        fillTableHoaDon(getIntCbHoaDon());
    }//GEN-LAST:event_jrHuyMouseClicked

    private void btnCreateHdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHdActionPerformed
        createHoaDon();
    }//GEN-LAST:event_btnCreateHdActionPerformed

    private void txtSdtKhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSdtKhKeyReleased
        // TODO add your handling code here:
        KhachHang object = cnBanHangDao.selectKhachHang(txtSdtKh.getText());
        if (object != null) {
            txtTenKh.setText(object.getTen());
        } else {
            txtTenKh.setText("");
        }
    }//GEN-LAST:event_txtSdtKhKeyReleased

    private void txtSearchSpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchSpKeyReleased
        // TODO add your handling code here:
        fillTableSanPham(txtSearchSp.getText());
    }//GEN-LAST:event_txtSearchSpKeyReleased

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
                fillTableHoaDon(0);
                clearForm();
                MsgBox.alert(this, "Thanh toán thành công!");
            }
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void tableSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSanPhamMouseClicked
        int index = tableSanPham.getSelectedRow();
        String maSp = tblModelSp.getValueAt(index, 1).toString();
        String giaBan = tblModelSp.getValueAt(index, 3).toString();
        txtMaSpAdd.setText(maSp);
        txtSoLuongAdd.setText("1");
        String soLuong = tblModelSp.getValueAt(index, 3).toString();
    }//GEN-LAST:event_tableSanPhamMouseClicked

    private void btnAddSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSpActionPerformed
        if (!txtMaSpAdd.getText().isBlank()) {
            // kiểm tra mã sản phẩm và số lượng nhập
            int soLuong = 1;
            try {
                soLuong = ValidateEx.convert(ValidateEx.checkIsNumF(txtSoLuongAdd, lbsoLuongThem), Integer.class);
            } catch (Exception e) {
                MsgBox.alert(this, e.getMessage());
                return;
            }
            SanPhamDto sp = cnBanHangDao.selectSanPham(txtMaSpAdd.getText()).get(0);
            if (sp.getSoLuong() < soLuong) {
                MsgBox.alert(this, "Lượng nhập vượt quá số lượng hàng còn lại trong kho !");
                return;
            }
            // thêm mới và hóa đơn chi tiết
            String maHd = txtMaHd.getText();
            HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
            // nếu hóa đơn chưa tồn tại tạo mới hóa đơn ở trạng thái chờ
            if (object == null) {
                MsgBox.alert(this, "Tạo mới hóa đơn để thêm sản phẩm!");
                return;
            }
            HoaDonCtDto hdCtDto = new HoaDonCtDto();
            hdCtDto.setIdHd(object.getId());
            hdCtDto.setIdSpCt(sp.getId());
            hdCtDto.setGia(sp.getGiaBan() * soLuong);
            hdCtDto.setSoLuong(soLuong);
            boolean check = cnBanHangDao.insertOrUpdateHoDonCt(hdCtDto);
            if (check) {
                MsgBox.alert(this, "Thêm giỏ hàng thành công!");
            } else {
                MsgBox.alert(this, "Thêm giỏ hàng thất bại!");
            }
            fillTableSanPham("");
            fillTableGiohang(maHd);
            updateFormThanhToan(maHd);
        } else {
            MsgBox.alert(this, "Chọn sản phẩm cần thêm!");
        }
    }//GEN-LAST:event_btnAddSpActionPerformed

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
                fillTableHoaDon(0);
                clearForm();
                MsgBox.alert(this, "Hủy hóa đơn thành công!");

                for (HoaDonCtDto h : cnBanHangDao.getHoaDonCtById(maHd)) {
                    cnBanHangDao.updateSanPhamCt(h.getIdSpCt(), h.getSoLuong());
                }
            }
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnClearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearFormActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnClearFormActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnAddSp;
    private fpt.views.swing.my.MyButton btnClearForm;
    private fpt.views.swing.my.MyButton btnCreateHd;
    private fpt.views.swing.my.MyButton btnHuy;
    private fpt.views.swing.my.MyButton btnThanhToan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton jrAll;
    private javax.swing.JRadioButton jrChuaHt;
    private javax.swing.JRadioButton jrDaHt;
    private javax.swing.JRadioButton jrHuy;
    private javax.swing.JLabel lbMaHd;
    private javax.swing.JLabel lbNgayTao;
    private javax.swing.JLabel lbSdtKh;
    private javax.swing.JLabel lbTenKh;
    private javax.swing.JLabel lbTenNv;
    private javax.swing.JLabel lbTienKhachDua;
    private javax.swing.JLabel lbTienThua;
    private javax.swing.JLabel lbTongTien;
    private javax.swing.JLabel lbsoLuongThem;
    private fpt.views.swing.PanelBorder panelBorder1;
    private fpt.views.swing.PanelBorder panelBorder2;
    private fpt.views.swing.PanelBorder panelBorder4;
    private fpt.views.swing.PanelBorder panelGioHang;
    private fpt.views.swing.PanelBorder panelGioHang1;
    private fpt.views.swing.PanelBorder panelHoDon;
    private javax.swing.JTable tableHoaDon;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTable tblGioHang;
    private fpt.views.swing.my.MyTextFiled txtMaHd;
    private fpt.views.swing.my.MyTextFiled txtMaSpAdd;
    private fpt.views.swing.my.MyTextFiled txtNgayTao;
    private fpt.views.swing.my.MyTextFiled txtSdtKh;
    private fpt.views.swing.my.MyTextFiled txtSearchSp;
    private fpt.views.swing.my.MyTextFiled txtSoLuongAdd;
    private fpt.views.swing.my.MyTextFiled txtTenKh;
    private fpt.views.swing.my.MyTextFiled txtTenNv;
    private fpt.views.swing.my.MyTextFiled txtThienKhachDua;
    private fpt.views.swing.my.MyTextFiled txtTienThua;
    private fpt.views.swing.my.MyTextFiled txtTongTien;
    // End of variables declaration//GEN-END:variables

    private void setup() {
        HoaDonDto hdd = new HoaDonDto();
        hdd.setMaHd(XFastFuntion.createCode());
        hdd.setNgayBan(new Date());
        hdd.setTenNv(UserSession.getInstance().getName());
        hdd.setMaNV(UserSession.getInstance().getMaNv());
        setFormHoaDon(hdd);
        //
        tblModelHd = (DefaultTableModel) tableHoaDon.getModel();
        fillTableHoaDon(getIntCbHoaDon());
        tblModelGioHang = (DefaultTableModel) tblGioHang.getModel();
        tblModelSp = (DefaultTableModel) tableSanPham.getModel();
        fillTableSanPham("");
        //
        btnHuy.setVisible(false);
    }

    private void setFormHoaDon(HoaDonDto object) {
        txtMaHd.setText(object.getMaHd());
        txtNgayTao.setText(XDate.toString(object.getNgayBan()));
        txtTenNv.setText(object.getTenNv());
        txtTongTien.setText(object.getTongTien() + "");
        txtThienKhachDua.setText(object.getTienkhDua() + "");
        txtTienThua.setText(object.getTienThua() + "");
        txtSdtKh.setText(object.getSdtKh());
        txtTenKh.setText(object.getTenKh());
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
        txtMaHd.setText(XFastFuntion.createCode());
        txtNgayTao.setText(XDate.toString(new Date()));
        txtTenNv.setText(UserSession.getInstance().getName());
        txtTongTien.setText("0.0");
        txtThienKhachDua.setText("0.0");
        txtTienThua.setText("0.0");
        txtSdtKh.setText("");
        txtTenKh.setText("");
        tblModelGioHang.setRowCount(0);
        tblModelGioHang.setRowCount(0);
        btnHuy.setVisible(false);
    }

    private HoaDonDto getFormHoaDon() {
        try {
            String maHd = ValidateEx.checkIsNull(txtMaHd, lbMaHd);
            Date ngayTao = new Date();
            String tenNv = UserSession.getInstance().getName();
            String maNv = UserSession.getInstance().getMaNv();
            Float tongTien = ValidateEx.convert(ValidateEx.checkIsNumF(txtTongTien, lbTongTien), Float.class);
            Float tienKhachDua = ValidateEx.convert(ValidateEx.checkIsNumF(txtThienKhachDua, lbTienKhachDua), Float.class);
            Float tienThua = ValidateEx.convert(ValidateEx.checkIsNumF(txtTienThua, lbTienThua), Float.class);
            String sdt = txtSdtKh.getText();
            String tenKh = "";
            if (!sdt.isBlank()) {
                tenKh = ValidateEx.checkIsNull(txtTenKh, lbTenKh);
            }
            HoaDonDto object = new HoaDonDto(tongTien, tienKhachDua, tienThua, sdt, tenKh, maNv, tenNv, 0, maHd, 0, 0, UserSession.getInstance().getId(), ngayTao, 2);
            if (!object.getSdtKh().isBlank()) {
                KhachHang kh = cnBanHangDao.createKhachHang(object.getSdtKh(), object.getTenKh());
                object.setIdKh(kh.getId());
            } else {
                object.setIdKh(0);
            }
            return object;
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
        return null;
    }

    private void createHoaDon() {
        String maHd = txtMaHd.getText();
        HoaDonDto object = cnBanHangDao.getHoaDonById(maHd);
        // nếu hóa đơn chưa tồn tại tạo mới hóa đơn ở trạng thái chờ
        if (object == null) {
            HoaDonDto hoaDonDto = getFormHoaDon();
            if (hoaDonDto != null) {
                cnBanHangDao.insertHoaDon(hoaDonDto);
                fillTableHoaDon(getIntCbHoaDon());
                MsgBox.alert(this, "Hóa đơn được tạo thành công và đang ở trạng thái chờ");
                btnHuy.setVisible(true);
            }
        } else {
            // Nếu hóa đơn tồn tại bản ghi kiểm tra trạng thái thanh toán
            // trạng thái hồ sơ (1: đã thanh toán, 2 chờ thanh toán, 3 hủy)
            if (object.getTrangThai() != 2) {
                MsgBox.alert(this, "Hóa đơn " + object.getMaHd() + " đã ở trạng thanh thái " + object.getTrangThaiText());
                return;
            }
            boolean check = MsgBox.confirm(this, "Hóa đơn chưa được thanh toán! chuyển về trạng thái chờ?");
            if (check) {
                MsgBox.alert(this, "check");
                clearForm();
            }
        }
    }

    private void updateFormThanhToan(String maHd) {
        float tongTien = 0;
        for (HoaDonCtDto object : cnBanHangDao.getHoaDonCtById(maHd)) {
            tongTien += object.getTongTen();
        }
        txtTongTien.setText(tongTien + "");
    }
}
