package Library;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author porta
 */
public class Render_CheckBox extends JCheckBox implements TableCellRenderer {

    private final JComponent component = new JCheckBox();

    public Render_CheckBox() {
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        ((JCheckBox) component).setBackground(new Color(0, 200, 0));

        boolean b = ((Boolean) value).booleanValue();
        ((JCheckBox) component).setSelected(b);
        return ((JCheckBox) component);
    }

}
