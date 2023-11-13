package fpt.views.form;

import fpt.dao.DanhMucDao;
import fpt.dao.DmAppParamDao;
import fpt.dao.DmAppParamDao.DM_PARAM;
import fpt.dao.DanhMucDao.DANH_MUC;
import fpt.dao.SanPhamDao;
import fpt.dao.ViewsProductDao;
import fpt.dto.ViewsProductDto;
import fpt.enity.*;
import fpt.utils.Contants.MODEL_VIEW;
import fpt.utils.MsgBox;
import fpt.views.event.EventDialogListener;
import fpt.views.swing.cell.TabelActionCellEditor;
import fpt.views.swing.cell.TableActionCellRender;
import fpt.views.event.TableActionEvent;
import fpt.views.swing.my.MyComboBox;
import java.awt.Dialog;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;

public class ViewsProducts extends javax.swing.JPanel implements EventDialogListener {

    private DmAppParamDao dmAppParamDao = new DmAppParamDao();
    private DanhMucDao danhMucDao = new DanhMucDao();
    private SanPhamDao sanPhamDao = new SanPhamDao();
    private ViewsProductDao viewsProductDao = new ViewsProductDao();

    private DefaultTableModel tableModel;

    public ViewsProducts() {
        initComponents();
        TableActionEvent actionEvent = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                onViewAddEdit(MODEL_VIEW.SUA, tableModel.getValueAt(row, 1) + "");
            }

            @Override
            public void onDelete(int row) {

                if (table.isEditing()) {
                    table.getCellEditor().stopCellEditing();
                }
                DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                if (MsgBox.confirm(panelBorder1, "bạn có chắc chắn muốn xóa ?")) {
                    viewsProductDao.deleteProduct(tableModel.getValueAt(row, 1) + "");
                    MsgBox.alert(panelBorder1, "Xóa thành công");
                    tableModel.fireTableDataChanged();
                    fillTable(null);
                }
            }

            @Override
            public void onView(int row) {
                onViewAddEdit(MODEL_VIEW.CHI_TIET, tableModel.getValueAt(row, 1) + "");
            }
        };
        table.setRowHeight(35);
        table.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(8).setCellEditor(new TabelActionCellEditor(actionEvent));
        table.getColumnModel().getColumn(0).setMaxWidth(40);
        table.getColumnModel().getColumn(8).setMinWidth(100);
        tableModel = (DefaultTableModel) table.getModel();
        setUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new fpt.views.swing.PanelBorder();
        panelSearch = new javax.swing.JPanel();
        lbMaSp = new javax.swing.JLabel();
        lbTenSp = new javax.swing.JLabel();
        lbDanhMuc = new javax.swing.JLabel();
        btnReset = new fpt.views.swing.my.MyButton();
        btnSearch = new fpt.views.swing.my.MyButton();
        cbDanhMuc = new fpt.views.swing.my.MyComboBox();
        cbTrangThai = new fpt.views.swing.my.MyComboBox();
        lbTrangThai = new javax.swing.JLabel();
        cbNhaSx = new fpt.views.swing.my.MyComboBox();
        lbNhaSx = new javax.swing.JLabel();
        cbKichCo = new fpt.views.swing.my.MyComboBox();
        lbKichCo = new javax.swing.JLabel();
        lbMauSac = new javax.swing.JLabel();
        cbMauSac = new fpt.views.swing.my.MyComboBox();
        txtMaSp = new fpt.views.swing.my.MyTextFiled();
        txtTenSp = new fpt.views.swing.my.MyTextFiled();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAdd = new fpt.views.swing.my.MyButton();

        panelBorder1.setForeground(new java.awt.Color(255, 255, 255));

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setForeground(new java.awt.Color(255, 255, 255));

        lbMaSp.setText("Mã sản phẩm");

        lbTenSp.setText("Tên sản phẩm");

        lbDanhMuc.setText("Danh mục");

        btnReset.setText("Xóa tìm kiếm");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbDanhMuc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cbDanhMuc.setPreferredSize(new java.awt.Dimension(200, 25));

        cbTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cbTrangThai.setPreferredSize(new java.awt.Dimension(200, 25));

        lbTrangThai.setText("Trạng thái");

        cbNhaSx.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cbNhaSx.setPreferredSize(new java.awt.Dimension(200, 25));

        lbNhaSx.setText("Nhà sản xuất");

        cbKichCo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cbKichCo.setPreferredSize(new java.awt.Dimension(200, 25));

        lbKichCo.setText("Kích cỡ");

        lbMauSac.setText("Màu sắc");

        cbMauSac.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));
        cbMauSac.setPreferredSize(new java.awt.Dimension(200, 25));

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbMaSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTenSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelSearchLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbDanhMuc, txtMaSp, txtTenSp});

        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenSp)
                            .addComponent(lbMaSp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbTrangThai)
                        .addGroup(panelSearchLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(cbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbNhaSx)
                        .addGroup(panelSearchLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(cbNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDanhMuc)
                    .addComponent(lbKichCo)
                    .addComponent(lbMauSac)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbKichCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMauSac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );

        panelSearchLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbDanhMuc, txtMaSp, txtTenSp});

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã SP", "Tên SP", "Giá", "Danh mục", "Nhà SX", "Kích cỡ", "Màu sắc", "Thao tác"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        btnAdd.setText("Thêm mới");
        btnAdd.setPreferredSize(new java.awt.Dimension(84, 25));
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
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        onViewAddEdit(MODEL_VIEW.THEM_MOI, null);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        fillTable(getForm());
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.my.MyButton btnAdd;
    private fpt.views.swing.my.MyButton btnReset;
    private fpt.views.swing.my.MyButton btnSearch;
    private fpt.views.swing.my.MyComboBox cbDanhMuc;
    private fpt.views.swing.my.MyComboBox cbKichCo;
    private fpt.views.swing.my.MyComboBox cbMauSac;
    private fpt.views.swing.my.MyComboBox cbNhaSx;
    private fpt.views.swing.my.MyComboBox cbTrangThai;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDanhMuc;
    private javax.swing.JLabel lbKichCo;
    private javax.swing.JLabel lbMaSp;
    private javax.swing.JLabel lbMauSac;
    private javax.swing.JLabel lbNhaSx;
    private javax.swing.JLabel lbTenSp;
    private javax.swing.JLabel lbTrangThai;
    private fpt.views.swing.PanelBorder panelBorder1;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JTable table;
    private fpt.views.swing.my.MyTextFiled txtMaSp;
    private fpt.views.swing.my.MyTextFiled txtTenSp;
    // End of variables declaration//GEN-END:variables

    private void setUp() {
        setUpCb(new DanhMucDao.DANH_MUC[]{DANH_MUC.DANH_MUC, DANH_MUC.KICH_CO, DANH_MUC.MAU_SAC, DANH_MUC.NHA_SX},
                cbDanhMuc,
                cbKichCo,
                cbMauSac,
                cbNhaSx);
        DefaultComboBoxModel comboBoxModel2 = (DefaultComboBoxModel) cbTrangThai.getModel();
        comboBoxModel2.removeAllElements();
        List<DmAppParam> lst = dmAppParamDao.getDmAppParam(DM_PARAM.TRANG_THAI);
        for (DmAppParam dm : lst) {
            comboBoxModel2.addElement(dm);
        }
        fillTable(null);
    }

    private void setUpCb(DanhMucDao.DANH_MUC[] args, MyComboBox... jcbs) {
        int index = 0;
        for (MyComboBox s : jcbs) {
            DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) s.getModel();
            comboBoxModel.removeAllElements();
            List<DanhMuc> lst = danhMucDao.getDanhMuc(args[index]);
            comboBoxModel.addElement(new DanhMuc(0, "Tất cả"));
            for (DanhMuc danhMuc : lst) {
                comboBoxModel.addElement(danhMuc);
            }
            index++;
        }
    }

//    private void fillTable(ViewsProductDto object) {
//        Vector<Vector<Object>> data = new Vector<>();
//        List<ViewsProductDto> lstSp;
//
//        if (object == null) {
//            lstSp = viewsProductDao.getAll();
//        } else {
//            lstSp = viewsProductDao.getAll(object);
//        }
//
//        for (ViewsProductDto s : lstSp) {
//            Vector<Object> row = new Vector<>();
//            row.add(data.size() + 1); // Index
//            row.add(s.getMaSanPham());
//            row.add(s.getTenSP());
//            row.add(s.getGiaBan());
//            row.add(s.getDanhMucText());
//            row.add(s.getNhaSxText());
//            row.add(s.getKichCoText());
//            row.add(s.getMauSacText());
//
//            data.add(row);
//        }
//
//        tableModel.setRowCount(0);
//
//        for (Vector<Object> row : data) {
//            tableModel.addRow(row);
//        }
//    }
    private void fillTable(ViewsProductDto object) {
        tableModel.setRowCount(0);
        List<ViewsProductDto> lstSp;
        if (object == null) {
            lstSp = viewsProductDao.getAll();
        } else {
            lstSp = viewsProductDao.getAll(object);
        }
        tableModel.setNumRows(0);
        int index = 0;
        for (ViewsProductDto s : lstSp) {
            tableModel.addRow(new Object[]{
                ++index, s.getMaSanPham(), s.getTenSP(), s.getGiaBan(), s.getDanhMucText(), s.getNhaSxText(), s.getKichCoText(), s.getMauSacText()
            });
        }
    }

    private ViewsProductDto getForm() {
        ViewsProductDto object = new ViewsProductDto();
        String maSP = txtMaSp.getText();
        String tenSp = txtTenSp.getText();
        boolean trangThai = !((DmAppParam) cbTrangThai.getSelectedItem()).getGiaTri().equals("0");
        int danhMuc = ((DanhMuc) cbDanhMuc.getSelectedItem()).getId();
        int kichCo = ((DanhMuc) cbKichCo.getSelectedItem()).getId();
        int mauSac = ((DanhMuc) cbMauSac.getSelectedItem()).getId();
        int nhaSx = ((DanhMuc) cbNhaSx.getSelectedItem()).getId();
        object.setMaSanPham(maSP);
        object.setTenSP(tenSp);
        object.setTrangThai(trangThai);
        object.setDanhMuc(danhMuc);
        object.setKichCo(kichCo);
        object.setMauSac(mauSac);
        object.setHangSx(nhaSx);
        return object;
    }

    private void clearForm() {
        txtMaSp.setText("");
        txtTenSp.setText("");
        cbTrangThai.setSelectedIndex(0);
        cbDanhMuc.setSelectedIndex(0);
        cbKichCo.setSelectedIndex(0);
        cbMauSac.setSelectedIndex(0);
        cbNhaSx.setSelectedIndex(0);
    }

    private JDialog jDialog;

    private void onViewAddEdit(MODEL_VIEW model_view, String maSp) {
        AddProductDialog addProductDialog;
        switch (model_view) {
            case THEM_MOI:
                addProductDialog = new AddProductDialog(model_view, null, this);
                break;
            case SUA:
                addProductDialog = new AddProductDialog(model_view, maSp, this);
                break;
            case CHI_TIET:
                addProductDialog = new AddProductDialog(model_view, maSp, this);
                break;
            default:
                throw new AssertionError();
        }
        jDialog = new JDialog();
        jDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        jDialog.setSize(680, 495);
        jDialog.setResizable(false);
        jDialog.add(addProductDialog);
        jDialog.setLocationRelativeTo(null);
        jDialog.setVisible(true);
    }

    @Override
    public void closeDialog() {
        jDialog.dispose();
        fillTable(null);
    }
}
