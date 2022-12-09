import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class google_GUI_TabbedPane_JTable_1 extends JFrame {
    JTable1 table1;
    JTable2 table2;
    JTabbedPane tab;

    public google_GUI_TabbedPane_JTable_1() {
        display();
        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        tab = new JTabbedPane(JTabbedPane.TOP);

        table1 = new JTable1();
        table2 = new JTable2();
        tab.addTab("인사관리 (기본)", table1);
        tab.addTab("인사관리 (상세)", table2);
        tab.addTab("리스트", new ListSelectionEventTest());
        add(tab);
    }

    public static void main(String[] args) {
        google_GUI_TabbedPane_JTable_1 test = new google_GUI_TabbedPane_JTable_1();
    }

}

class JTable1 extends JPanel {
    JTable1() {
        String[] title = { "번호", "이름", "입사일" };
        String[][] data = {
                { "1", "장동건", "2003-01-01" },
                { "2", "이민호", "2001-02-01" },
                { "3", "강민정", "2000-01-18" },
                { "4", "콜록콜ㄹ", "2020-03-01" }
        };
        JTable table = new JTable(data, title);
        JScrollPane scroll = new JScrollPane(table);
        add(scroll, BorderLayout.CENTER);
    }
}