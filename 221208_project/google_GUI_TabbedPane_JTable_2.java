
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class google_GUI_TabbedPane_JTable_2 extends JPanel {
    JLabel title = new JLabel("IT EDU 학생 목록");

    JScrollPane sp;
    JTable table;

    DefaultTableModel model;

    Vector data = new Vector();

    Vector<String> colName;

    public void SelectForm() {
        dataSetting();
        showAllData();
        display();
        setVisible(true);
    }

    public void dataSetting() {
        colName = new Vector<String>();
        colName.add("아이디");
        colName.add("패스워드");
        colName.add("성명");
        colName.add("주소");
        colName.add("메모");
        colName.add("등록일");
    }

    public void showAllData() {
        MemberDAO dao = new MemberDAO();
        data = dao.selectAll();
    }

    public void display() {
        setLayout(new BorderLayout(10, 10));
        title.setFont(new Font("default", Font.BOLD, 30));

        add("North", title);

        model = new DefaultTableModel(data, colName);
        table = new JTable(model);
        sp = new JScrollPane(table);

        add("Center", sp);

        table.setPreferredScrollableViewportSize(new Dimension(700, data.size() * 30));

        JButton btn = new JButton("push");
        add("South", btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerfored(ActionEvent e) {
                System.out.println(model.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
            }
        });
    }

    public static void main(String[] args) {
        new google_GUI_TabbedPane_JTable_2();
    }

}
