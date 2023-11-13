package fpt.views.swing.cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableActionCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        PanelAction panelAction = new PanelAction();
        if (!isSelected && row % 2 == 0) {
            panelAction.setBackground(Color.white);
        } else {
            panelAction.setBackground(com.getBackground());
        }
        return panelAction;
    }

}
