package fpt.views.swing.cell;

import fpt.views.event.TableActionEvent;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class TabelActionCellEditor extends DefaultCellEditor {

    private TableActionEvent event;

    public TabelActionCellEditor(TableActionEvent event) {
        super(new JCheckBox());
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        PanelAction action = new PanelAction();
        if (row >= table.getRowCount()) {
            row = table.getRowCount() - 1;
        }
        action.initEvent(event, row);
        action.setBackground(table.getSelectionBackground());
        return action;
    }

}
