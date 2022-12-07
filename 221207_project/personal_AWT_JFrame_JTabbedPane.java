import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class personal_AWT_JFrame_JTabbedPane extends JFrame {
    JTabbedPane tab = new JTabbedPane();

    JPanel jp = new JPanel();

    String header[] = { "국민통장", "총 수입", "총 지출", "남은 금액" };
    String contents[][] = {
            { "", "", "", "", "", "" },
            { "일자", "분류", "항목", "수입", "지출", "총 금액" }
    };

    JTable table = new JTable(contents, header);
    JScrollPane sp = new JScrollPane(table);

    public personal_AWT_JFrame_JTabbedPane() {
        super();

        jp.add(table);
        jp.add(table);
        jp.add(table);

        tab.add("국민통장", jp);
        tab.add("온통대전", jp);
        tab.add("미분류", jp);

        add(tab);

        setSize(400, 150);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new personal_AWT_JFrame_JTabbedPane();
    }

}
