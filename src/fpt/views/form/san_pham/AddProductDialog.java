package fpt.views.form.san_pham;

import fpt.dao.DanhMucDao;
import fpt.dao.DmAppParamDao;
import fpt.dao.DanhMucDao.DANH_MUC;
import fpt.dao.ViewsProductDao;
import fpt.dto.ViewsProductDto;
import fpt.enity.DanhMuc;
import fpt.utils.Contants;
import static fpt.utils.Contants.MODEL_VIEW.SUA;
import static fpt.utils.Contants.MODEL_VIEW.THEM_MOI;
import static fpt.utils.Contants.MODEL_VIEW.THEM_MOI_CT;
import fpt.utils.MsgBox;
import fpt.utils.ValidateEx;
import fpt.views.event.EventDialogListener;
import fpt.views.swing.my.MyComboBox;
import java.awt.Dialog;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;

public class AddProductDialog extends javax.swing.JPanel implements EventDialogListener {

    private DmAppParamDao dmAppDao = new DmAppParamDao();
    private DanhMucDao danhMucDao = new DanhMucDao();
    private ViewsProductDao viewsProductDao = new ViewsProductDao();

    private Contants.MODEL_VIEW model;

    public AddProductDialog(Contants.MODEL_VIEW model_view, String maSp, String tenSp, EventDialogListener dialogListener) {
        initComponents();
        this.dialogListener = dialogListener;
        setUp(model_view, maSp, tenSp);
    }

    public AddProductDialog(Contants.MODEL_VIEW model_view, String maSp, EventDialogListener dialogListener) {
        initComponents();
        this.dialogListener = dialogListener;
        setUp(model_view, maSp, null);
    }

    private EventDialogListener dialogListener;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new fpt.views.swing.PanelBorder();
        lbMaSp = new javax.swing.JLabel();
        txtMaSp = new fpt.views.swing.my.MyTextFiled();
        txtTenSp = new fpt.views.swing.my.MyTextFiled();
        lbTenSp = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaBan = new fpt.views.swing.my.MyTextFiled();
        lbGiaBan = new javax.swing.JLabel();
        txtGiaNhap = new fpt.views.swing.my.MyTextFiled();
        lbGiaNhap = new javax.swing.JLabel();
        txtSoLuong = new fpt.views.swing.my.MyTextFiled();
        lbSoLuong = new javax.swing.JLabel();
        lbNhaSx = new javax.swing.JLabel();
        lbDanhMuc = new javax.swing.JLabel();
        cbNhaSx = new fpt.views.swing.my.MyComboBox();
        cbDanhMuc = new fpt.views.swing.my.MyComboBox();
        btnChangeImg = new fpt.views.swing.my.MyButton();
        cbMau = new fpt.views.swing.my.MyComboBox();
        lbMau = new javax.swing.JLabel();
        cbKichCo = new fpt.views.swing.my.MyComboBox();
        lbKichCo = new javax.swing.JLabel();
        lbGhiChu = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtGhiChu = new fpt.views.swing.my.MyTextArea();
        btnCancel = new fpt.views.swing.my.MyButton();
        btnSave = new fpt.views.swing.my.MyButton();
        isHoatDong = new javax.swing.JCheckBox();
        myButton1 = new fpt.views.swing.my.MyButton();
        btnAddmau = new fpt.views.swing.my.MyButton();
        btnAddDanhMuc = new fpt.views.swing.my.MyButton();
        btnAddKichCo = new fpt.views.swing.my.MyButton();

        setPreferredSize(new java.awt.Dimension(680, 460));

        panelBorder1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 227, 227)));
        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder1.setPreferredSize(new java.awt.Dimension(700, 600));

        lbMaSp.setText("Mã Sản phẩm");

        txtMaSp.setPreferredSize(new java.awt.Dimension(200, 25));

        txtTenSp.setPreferredSize(new java.awt.Dimension(200, 25));

        lbTenSp.setText("Tên sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Img");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        txtGiaBan.setPreferredSize(new java.awt.Dimension(200, 25));

        lbGiaBan.setText("Giá bán");

        txtGiaNhap.setPreferredSize(new java.awt.Dimension(200, 25));

        lbGiaNhap.setText("Giá nhập");

        txtSoLuong.setPreferredSize(new java.awt.Dimension(200, 25));

        lbSoLuong.setText("Số lượng");

        lbNhaSx.setText("Nhà sản xuất");

        lbDanhMuc.setText("Danh mục");

        cbNhaSx.setPreferredSize(new java.awt.Dimension(200, 25));

        cbDanhMuc.setPreferredSize(new java.awt.Dimension(200, 25));

        btnChangeImg.setText("Thay đổi ảnh");
        btnChangeImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeImgActionPerformed(evt);
            }
        });

        cbMau.setPreferredSize(new java.awt.Dimension(200, 25));

        lbMau.setText("Màu");

        cbKichCo.setPreferredSize(new java.awt.Dimension(200, 25));

        lbKichCo.setText("Kích cỡ");

        lbGhiChu.setText("Ghi chú");

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane1.setViewportView(txtGhiChu);

        btnCancel.setText("Hủy");
        btnCancel.setPreferredSize(new java.awt.Dimension(89, 25));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.setPreferredSize(new java.awt.Dimension(89, 25));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        isHoatDong.setText("Hoạt động");
        isHoatDong.setPreferredSize(new java.awt.Dimension(84, 25));

        myButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/icons8-add-25.png"))); // NOI18N
        myButton1.setPreferredSize(new java.awt.Dimension(72, 25));
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        btnAddmau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/icons8-add-25.png"))); // NOI18N
        btnAddmau.setPreferredSize(new java.awt.Dimension(72, 25));
        btnAddmau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddmauActionPerformed(evt);
            }
        });

        btnAddDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/icons8-add-25.png"))); // NOI18N
        btnAddDanhMuc.setPreferredSize(new java.awt.Dimension(72, 25));
        btnAddDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDanhMucActionPerformed(evt);
            }
        });

        btnAddKichCo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/icons8-add-25.png"))); // NOI18N
        btnAddKichCo.setPreferredSize(new java.awt.Dimension(72, 25));
        btnAddKichCo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKichCoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbGhiChu)))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbMaSp))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTenSp)))
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbGiaBan))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbGiaNhap)))
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbMau)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(cbMau, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAddmau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbKichCo)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(cbKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAddKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panelBorder1Layout.createSequentialGroup()
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbNhaSx)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(cbNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbDanhMuc)
                                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                                .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAddDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(isHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbSoLuong))
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnChangeImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChangeImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbTenSp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbGiaNhap)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbMaSp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbGiaBan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbSoLuong)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(isHoatDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDanhMuc)
                            .addComponent(myButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbNhaSx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbMau)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(lbKichCo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAddmau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        handelAfterSave();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        dialogListener.closeDialog();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangeImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeImgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeImgActionPerformed

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        showDiaLogAddTt(DANH_MUC.NHA_SX);
    }//GEN-LAST:event_myButton1ActionPerformed

    private void btnAddmauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddmauActionPerformed
        showDiaLogAddTt(DANH_MUC.MAU_SAC);
    }//GEN-LAST:event_btnAddmauActionPerformed

    private void btnAddDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDanhMucActionPerformed
        showDiaLogAddTt(DANH_MUC.DANH_MUC);
    }//GEN-LAST:event_btnAddDanhMucActionPerformed

    private void btnAddKichCoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKichCoActionPerformed
        showDiaLogAddTt(DANH_MUC.KICH_CO);
    }//GEN-LAST:event_btnAddKichCoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnAddDanhMuc;
    private fpt.views.swing.my.MyButton btnAddKichCo;
    private fpt.views.swing.my.MyButton btnAddmau;
    private fpt.views.swing.my.MyButton btnCancel;
    private fpt.views.swing.my.MyButton btnChangeImg;
    private fpt.views.swing.my.MyButton btnSave;
    private fpt.views.swing.my.MyComboBox cbDanhMuc;
    private fpt.views.swing.my.MyComboBox cbKichCo;
    private fpt.views.swing.my.MyComboBox cbMau;
    private fpt.views.swing.my.MyComboBox cbNhaSx;
    private javax.swing.JCheckBox isHoatDong;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDanhMuc;
    private javax.swing.JLabel lbGhiChu;
    private javax.swing.JLabel lbGiaBan;
    private javax.swing.JLabel lbGiaNhap;
    private javax.swing.JLabel lbKichCo;
    private javax.swing.JLabel lbMaSp;
    private javax.swing.JLabel lbMau;
    private javax.swing.JLabel lbNhaSx;
    private javax.swing.JLabel lbSoLuong;
    private javax.swing.JLabel lbTenSp;
    private fpt.views.swing.my.MyButton myButton1;
    private fpt.views.swing.PanelBorder panelBorder1;
    private fpt.views.swing.my.MyTextArea txtGhiChu;
    private fpt.views.swing.my.MyTextFiled txtGiaBan;
    private fpt.views.swing.my.MyTextFiled txtGiaNhap;
    private fpt.views.swing.my.MyTextFiled txtMaSp;
    private fpt.views.swing.my.MyTextFiled txtSoLuong;
    private fpt.views.swing.my.MyTextFiled txtTenSp;
    // End of variables declaration//GEN-END:variables

    private void setUp(Contants.MODEL_VIEW model_view, String maSp) {
        setUp(model_view, maSp, null);
    }

    private void setUp(Contants.MODEL_VIEW model_view, String maSp, String tenSp) {
        // fill data for combobox
        setUpCb(new DANH_MUC[]{DANH_MUC.DANH_MUC, DANH_MUC.KICH_CO, DANH_MUC.MAU_SAC, DANH_MUC.NHA_SX},
                cbDanhMuc,
                cbKichCo,
                cbMau,
                cbNhaSx);
        model = model_view;

        // fill data for form input
        setUpData(maSp, model_view, tenSp);
    }

    private void setUpData(String maSp, Contants.MODEL_VIEW model_view, String tenSp) {
        switch (model_view) {
            case THEM_MOI:
                break;
            case THEM_MOI_CT:
                txtMaSp.setEditable(false);
                txtMaSp.setText(maSp);
                txtTenSp.setText(tenSp);
                break;
            case SUA:
                txtMaSp.setEditable(false);
                setForm(viewsProductDao.getById(maSp));
                break;
            case CHI_TIET:
                txtMaSp.setEditable(false);
                setForm(viewsProductDao.getById(maSp));
                txtTenSp.setEditable(false);
                txtGiaBan.setEditable(false);
                txtGiaNhap.setEditable(false);
                txtSoLuong.setEditable(false);
                isHoatDong.setEnabled(false);
                cbNhaSx.setEditable(false);
                cbDanhMuc.setEditable(false);
                cbMau.setEditable(false);
                cbKichCo.setEditable(false);
                txtGhiChu.setEditable(false);
                btnSave.setVisible(false);
                break;
            default:
                throw new AssertionError();
        }
    }

    private void setUpCb(DANH_MUC[] args, MyComboBox... jcbs) {
        int index = 0;
        for (MyComboBox s : jcbs) {
            DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) s.getModel();
            comboBoxModel.removeAllElements();
            List<DanhMuc> lst = danhMucDao.getDanhMuc(args[index]);
            for (DanhMuc danhMuc : lst) {
                comboBoxModel.addElement(danhMuc);
            }
            index++;
        }
    }

    private ViewsProductDto getForm() {
        try {
            ViewsProductDto object = new ViewsProductDto();
            String maSp = ValidateEx.checkIsNullWithLengt(txtMaSp, lbMaSp, 20);
            String tenSp = ValidateEx.checkIsNull(txtTenSp, lbTenSp);
            Float giaBan = ValidateEx.convert(ValidateEx.checkMoreThan(txtGiaBan, lbGiaBan, 0), Float.class);
            Float giaNhap = ValidateEx.convert(ValidateEx.checkMoreThan(txtGiaNhap, lbGiaNhap, 0), Float.class);
            int soLuong = ValidateEx.convert(ValidateEx.checkMoreThan(txtSoLuong, lbSoLuong), Integer.class);
            int danhMuc = ((DanhMuc) cbDanhMuc.getSelectedItem()).getId();
            int kichCo = ((DanhMuc) cbKichCo.getSelectedItem()).getId();
            int mauSac = ((DanhMuc) cbMau.getSelectedItem()).getId();
            int nhaSx = ((DanhMuc) cbNhaSx.getSelectedItem()).getId();
            String ghiChu = txtGhiChu.getText();
            object.setMaSanPham(maSp);
            object.setTenSP(tenSp);
            object.setTrangThai(isHoatDong.isSelected());
            object.setGiaNhap(giaNhap);
            object.setGiaBan(giaBan);
            object.setSoLuong(soLuong);
            object.setHangSx(nhaSx);
            object.setDanhMuc(danhMuc);
            object.setMauSac(mauSac);
            object.setKichCo(kichCo);
            object.setMoTa(ghiChu);
            return object;
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
        return null;
    }

    private void setForm(ViewsProductDto object) {
        txtMaSp.setText(object.getMaSanPham());
        txtTenSp.setText(object.getTenSP());
        isHoatDong.setSelected(object.getTrangThai());
        txtGiaBan.setText(object.getGiaBan() + "");
        txtGiaNhap.setText(object.getGiaNhap() + "");
        txtSoLuong.setText(object.getSoLuong() + "");
        cbDanhMuc.setSelectedIndex(getIndexCbox(cbDanhMuc, object.getDanhMuc()));
        cbKichCo.setSelectedIndex(getIndexCbox(cbKichCo, object.getKichCo()));
        cbMau.setSelectedIndex(getIndexCbox(cbMau, object.getMauSac()));
        cbNhaSx.setSelectedIndex(getIndexCbox(cbNhaSx, object.getHangSx()));
        txtGhiChu.setText(object.getMoTa());
    }

    private int getIndexCbox(MyComboBox cb, int id) {
        DefaultComboBoxModel<DanhMuc> cbModel = (DefaultComboBoxModel<DanhMuc>) cb.getModel();
        int itemCount = cbModel.getSize();
        for (int i = 0; i < itemCount; i++) {
            DanhMuc item = cbModel.getElementAt(i);
            if (item.getId() == id) {
                return i;
            }
        }
        return 0;
    }

    private void clearForm() {
        txtMaSp.setText("");
        txtTenSp.setText("");
        isHoatDong.setSelected(false);
        cbDanhMuc.setSelectedIndex(0);
        cbKichCo.setSelectedIndex(0);
        cbMau.setSelectedIndex(0);
        cbNhaSx.setSelectedIndex(0);
    }

    private void handelAfterSave() {
        ViewsProductDto object = getForm();
        if (object == null) {
            return;
        }
        boolean check = viewsProductDao.checkExists(object.getMaSanPham()).size() > 0;
        if (model == Contants.MODEL_VIEW.THEM_MOI && check) {
            MsgBox.alert(this, "Mã sản phẩm " + object.getMaSanPham() + " đã tồn tại!");
            return;
        }
        if ((model == Contants.MODEL_VIEW.SUA || model == Contants.MODEL_VIEW.THEM_MOI_CT) && !check) {
            MsgBox.alert(this, "Mã sản phẩm " + object.getMaSanPham() + " không tồn tại!");
            return;
        }
        handelSave(object);
    }

    private void handelSave(ViewsProductDto object) {
        try {
            if (model == Contants.MODEL_VIEW.THEM_MOI) {
                ViewsProductDto obj = viewsProductDao.insert2(object);
                if (obj != null) {
                    object.setId(obj.getId());
                    viewsProductDao.insertSpCt(object.getMaSanPham(), object);
                }
                MsgBox.alert(this, "Thêm mới thành công");
            } else if (model == Contants.MODEL_VIEW.SUA) {
                viewsProductDao.updateProduct(object);
                MsgBox.alert(this, "Cập nhật thành công");
            }
            clearForm();
            dialogListener.closeDialog();
        } catch (Exception e) {
            if (model == Contants.MODEL_VIEW.THEM_MOI) {
                viewsProductDao.deleteProduct(object.getMaSanPham());
            }
            e.printStackTrace();
        }
    }

    private JDialog jDialog;

    private void showDiaLogAddTt(DANH_MUC danh_muc) {
        DialogAddThuocTinh diaLogTt = new DialogAddThuocTinh(danh_muc, this);
        jDialog = new JDialog();
        jDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        jDialog.setSize(410, 90);
        jDialog.setResizable(false);
        jDialog.add(diaLogTt);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }

    @Override
    public void closeDialog() {
        jDialog.dispose();
        setUpCb(new DANH_MUC[]{DANH_MUC.DANH_MUC, DANH_MUC.KICH_CO, DANH_MUC.MAU_SAC, DANH_MUC.NHA_SX},
                cbDanhMuc,
                cbKichCo,
                cbMau,
                cbNhaSx);
    }
}
