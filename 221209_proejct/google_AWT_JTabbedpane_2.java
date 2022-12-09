import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class google_AWT_JTabbedpane_2 extends JFrame {
    JTabbedPane tab;
    JTable1 j1;
    JTable2 j2;

    public google_AWT_JTabbedpane_2() {
        super("JTabbedPane 연습");
        tab = new JTabbedPane(JTabbedPane.TOP);

        JPanel one = new JPanel();
        j1 = new JTable1();

        JPanel two = new JPanel();
        j2 = new JTable2();

        one.add(j1);
        two.add(j2);

        tab.addTab("기본 데이터", one);
        tab.addTab("기타 데이터", two);

        getContentPane().add(tab, BorderLayout.CENTER);
        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        google_AWT_JTabbedpane_2 jt = new google_AWT_JTabbedpane_2();
        jt.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class JTable2 extends JPanel {
    public JTable2() {
        String title[] = { "번호", "직업", "소속" };
        String data[][] = {
                { "1", "프로그래머", "네이X" },
                { "2", "백수", "집" },
                { "3", "디자이너", "엔X소X트" }
        };

        JTable table = new JTable(data, title);
        JScrollPane sp = new JScrollPane(table);
        add(sp);
    }

}

class JTable1 extends JPanel {
    public JTable1() {
        String title[] = { "번호", "이름", "나이" };
        String data[][] = {
                { "1", "너구리", "26" },
                { "2", "돼   지", "25" },
                { "3", "족제비", "26" }
        };

        JTable table = new JTable(data, title);
        JScrollPane sp = new JScrollPane(table);
        add(sp);
    }
}