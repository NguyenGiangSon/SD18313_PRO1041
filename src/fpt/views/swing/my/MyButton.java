package fpt.views.swing.my;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

public class MyButton extends JButton {

    public MyButton() {
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setColor(getBackground());
        g2.dispose();
        super.paintComponent(grphcs);
    }
}