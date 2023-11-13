package fpt.views.swing.cell;

import fpt.views.event.TableActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAction extends javax.swing.JPanel {

    public PanelAction() {
        initComponents();
    }
    
        public void initEvent(TableActionEvent event, int indexRow) {
        cmdEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onEdit(indexRow);
            }
        });
        cmdDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onDelete(indexRow);
            }
        });
        cmdDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                event.onView(indexRow);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdEdit = new fpt.views.swing.cell.ActionButton();
        cmdDelete = new fpt.views.swing.cell.ActionButton();
        cmdDetail = new fpt.views.swing.cell.ActionButton();

        setPreferredSize(new java.awt.Dimension(135, 25));

        cmdEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/edit-20.png"))); // NOI18N

        cmdDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/delete-20.png"))); // NOI18N

        cmdDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fpt/icon/detail-20.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.swing.cell.ActionButton cmdDelete;
    private fpt.views.swing.cell.ActionButton cmdDetail;
    private fpt.views.swing.cell.ActionButton cmdEdit;
    // End of variables declaration//GEN-END:variables
}
