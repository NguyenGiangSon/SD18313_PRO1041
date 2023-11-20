package fpt.views.form.san_pham;

import fpt.dao.DanhMucDao;
import fpt.dao.DanhMucDao.DANH_MUC;
import fpt.enity.DanhMuc;
import fpt.utils.MsgBox;
import fpt.utils.ValidateEx;
import fpt.views.event.EventDialogListener;

public class DialogAddThuocTinh extends javax.swing.JPanel {

    private DANH_MUC model;

    private DanhMucDao danhMucDao = new DanhMucDao();
    
    private EventDialogListener dialogListener;

    public DialogAddThuocTinh(DANH_MUC danh_muc, EventDialogListener dialogListener) {
        initComponents();
        model = danh_muc;
        this.dialogListener = dialogListener;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new fpt.views.swing.PanelBorder();
        lbValue = new javax.swing.JLabel();
        txtValue = new fpt.views.swing.my.MyTextFiled();
        btnAdd = new fpt.views.swing.my.MyButton();

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        lbValue.setText("Giá trị");
        lbValue.setPreferredSize(new java.awt.Dimension(31, 25));

        txtValue.setPreferredSize(new java.awt.Dimension(85, 25));

        btnAdd.setText("Thêm");
        btnAdd.setPreferredSize(new java.awt.Dimension(89, 25));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBorder1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbValue, txtValue});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addThuocTinh();
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnAdd;
    private javax.swing.JLabel lbValue;
    private fpt.views.swing.PanelBorder panelBorder1;
    private fpt.views.swing.my.MyTextFiled txtValue;
    // End of variables declaration//GEN-END:variables

    private void addThuocTinh() {
        try {
            String value = ValidateEx.checkIsNull(txtValue, lbValue);
            DanhMuc object = danhMucDao.getByTen(model, value);
            if (object == null) {
                danhMucDao.addDanhMuc(model, value);
                MsgBox.alert(this, "Thêm mới thành công");
                this.dialogListener.closeDialog();
            } else {
                MsgBox.alert(this, "Giá trị " + value + " Đã tồn tại");
            }
        } catch (Exception e) {
            MsgBox.alert(this, e.getMessage());
        }
    }
}
