package fpt.views.swing;

import fpt.views.model.ModelMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class MenuItem extends javax.swing.JPanel {

    private Boolean selected;

    public MenuItem(ModelMenu modelMenu) {
        initComponents();
        setOpaque(false);
        if (modelMenu.getMenuType() == ModelMenu.MenuType.MENU) {
            lbIcon.setIcon(modelMenu.toIcon());
            lbName.setText(modelMenu.getName());
        } else if (modelMenu.getMenuType() == ModelMenu.MenuType.TITLE) {
            lbIcon.setText(modelMenu.getName());
            lbIcon.setFont(new Font(Font.SANS_SERIF, 1, 12));
            lbName.setVisible(false);
        } else {
            lbName.setText(" ");
        }
    }

    public void setSelectd(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth(), getHeight(), 10, 10);
            g2.fillRect(-10, 0, getWidth(), getHeight());
        }
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(400, 35));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 5));

        lbIcon.setForeground(new java.awt.Color(255, 255, 255));
        add(lbIcon);

        lbName.setForeground(new java.awt.Color(255, 255, 255));
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Menu name");
        add(lbName);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    // End of variables declaration//GEN-END:variables
}
