package fpt.views.swing.my;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JTextField;

public class MyTextFiled extends JTextField {

    public MyTextFiled() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255, 255, 255, 80));
        g2.fillRoundRect(10, 0, getWidth(), getHeight(), 10, 10);
        g2.fillRect(-10, 0, getWidth(), getHeight());
        super.paintComponent(g);
    }

}
