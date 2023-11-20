package fpt.views;

import fpt.utils.MsgBox;
import fpt.views.form.dashboard.ViewsDashboard;
import fpt.views.swing.ScrollBar;
import java.awt.Color;
import fpt.views.event.EventMenuSelected;
import fpt.views.form.ban_hang.ViewsBanHang;
import fpt.views.form.ban_hang.ViewsBanHang2;
import fpt.views.form.ban_hang.ViewsHoaDon;
import fpt.views.form.san_pham.ViewsProducts;
import javax.swing.JComponent;

public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
        setBackground(new Color(0, 0, 0));
        menu.initMoving(ViewMain.this);
        sb.setVerticalScrollBar(new ScrollBar());
        //
        setForm(new ViewsDashboard());
        //
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println("choose index = " + index);
                if (index == 0) {
                    setForm(new ViewsDashboard());
                } else if (index == 1) {
                    setForm(new ViewsProducts());
                } else if (index == 2) {
                    setForm(new ViewsBanHang());
                } else if (index == 3) {
                    setForm(new ViewsBanHang2());
                } else if (index == 4) {
                    setForm(new ViewsHoaDon());
                } else if (index == 5) {
                    boolean confirm = MsgBox.confirm(panelBorder2, "Bạn có chắc chắn muốn thoát?");
                    if (confirm) {
                        dispose();
                    }
                }
            }
        });
    }

    private void setForm(JComponent component) {
        mainPanel.removeAll();
        mainPanel.add(component);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder2 = new fpt.views.swing.PanelBorder();
        header1 = new fpt.views.components.Header();
        menu = new fpt.views.components.Menu();
        sb = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        panelBorder2.setForeground(new java.awt.Color(224, 224, 224));

        menu.setPreferredSize(new java.awt.Dimension(215, 600));

        sb.setBorder(null);
        sb.setOpaque(false);

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());
        sb.setViewportView(mainPanel);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fpt.views.components.Header header1;
    private javax.swing.JPanel mainPanel;
    private fpt.views.components.Menu menu;
    private fpt.views.swing.PanelBorder panelBorder2;
    private javax.swing.JScrollPane sb;
    // End of variables declaration//GEN-END:variables
}
