import java.awt.Dimension;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class google_GUI_JTable_DataManagement_Chulsu extends JFrame implements TableModelListener {

    public static void main(String[] args) {
        new google_GUI_JTable_DataManagement_Chulsu();
    }

    private JTable table;
    private JScrollPane sp;
    private String[] columnType = { "번호", "이름", "나이", "성별" };
    private Object[][] data = {
            { "1", "Chulsu", "20", "T" },
            { "2", "Okja", "56", "F" },
            { "3", "MJ", "23", "F" },
            { "4", "TH", "21", "T" }
    };

    google_GUI_JTable_DataManagement_Chulsu() {
        super("JTable Test");
        setSize(500, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        table = new JTable(data, columnType);
        sp = new JScrollPane(table);

        table.setPreferredScrollableViewportSize(new Dimension(500, 300));
        table.setFillsViewportHeight(true);

        table.getModel().addTableModelListener(this);
        table.setAutoCreateRowSorter(true);

        TableColumn genderColumn = table.getColumn("성별");
        JComboBox gender = new JComboBox();
        gender.addItem("T");
        gender.addItem("F");
        genderColumn.setCellEditor(new DefaultCellEditor(gender));

        add(sp);
        setVisible(true);
    }

    public void tableChanged(TableModelEvent e) {
        int row = e.getFirstRow();
        int column = e.getColumn();

        if (column == 2) {
            TableModel model = (TableModel) e.getSource();
            String colName = model.getColumnName(column);
            String str = (String) model.getValueAt(row, column);

            if (Integer.parseInt(str) > 100) {
                JOptionPane.showMessageDialog(this, "나이 범위를 초과하였습니다. 100미만으로 입력해주세요.", "경고",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}
