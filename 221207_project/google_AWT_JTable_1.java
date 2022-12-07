import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class google_AWT_JTable_1 {

    public static void main(String[] args) {
        Dimension dim = new Dimension(400, 150);

        JFrame frame = new JFrame("Morph's House");
        frame.setLocation(200, 400);
        frame.setPreferredSize(dim);

        String header[] = { "학생이름", "국어", "영어", "수학" };
        String contents[][] = {
                { "박영수", "90", "87", "98" },
                { "김영희", "100", "99", "100" },
                { "김철수", "30", "25", "9" }
        };

        JTable table = new JTable(contents, header);
        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);

        // table.setValueAt("200", 1, 1);
        // System.out.println(table.getValueAt(1, 1));
        frame.pack();
        frame.setVisible(true);

    }

}
