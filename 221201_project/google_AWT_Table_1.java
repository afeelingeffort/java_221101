import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

class MainFrame_table extends JFrame {
    GridBagLayout g bl=new GridBagLayout();
    GridBagConstraints g bc=new GridBagConstraints();

    public MainFrame_table() {
              super("Demo Frame");

              try {
                     System.out.println("setting look and feel");
                     UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
              }  catch (Exception e) {
                     System.out.println("Unable to set LookAndFeel");
              }

              DefaultTableMod e l dtm = new DefaultTableModel() {
                     public boolean isCellEditable(int row, int col) {
                             re turn !(col == 0);
                     }
              };

              Object[][ ]  data = new Object[1][3];

              data [ 0][0] = "내용1";
              data [ 0][1] = "내용2";
              data [ 0][2] = "내용3";

              String[] c olu mns = { "col1", "col2" , "col3" };

              dtm.setDataVector(data, columns);

              JTa b le jt = new JTable(dtm);

              add(new JScrollPane(jt), BorderLayout.CENTER);
       }
}

public class google_AWT_Table_1 {

    public static void main(String[] args) {
        JFrame frame = new MainFrame_table();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

}
