import javax.swing.JTable;

public class google_GUI_JTable {

    public static void main(String[] args) {
        String[] colnum1 = { "col1", "col2", "col3", "col4", "col5" };

        Object[][] data1 = {
                { "data1", "data2", "data3", "data4", "data5" },
                { "data1", "data2", "data3", "data4", "data5" },
                { "data1", "data2", "data3", "data4", "data5" },
                { "data1", "data2", "data3", "data4", "data5" },
                { "data1", "data2", "data3", "data4", "data5" },
                { "data1", "data2", "data3", "data4", "data5" },
        };

        JTable jt = new JTable(data1, colnum1);

        jt.setVisible(true);
    }

}
