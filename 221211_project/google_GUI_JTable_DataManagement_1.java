import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class google_GUI_JTable_DataManagement_1 {
    public static void main(String[] args) {
        new google_GUI_JTable_DataManagement_1();
    }

}

class EventHandler implements ActionListener {
    JTable table;
    int aaa;

    public EventHandler(JTable table) {
        this.table = table;
    }

    public void actionPerfored(ActionEvent e) {
        int n = table.getSelectedRow();

        DefaultTableModel tm = (DefaultTableModel) table.getModel();

        if (n >= 0 && n < table.getRowCount()) {
            System.out.println("삭제를 누르셨습니다.");
            tm.removeRow(n);
        }
    }
}

class MyWindow extends JFrame {
    JTable table;
    JButton addBtn;
    JButton delBtn;

    private int flag = 0;
    private static int n;

    JTextField nameField;
    JComboBox telCombo;
    JTextField addressField;
    int AAA;

    public MyWindow() {
        super("데이터 관리");

        String[] columnName = { "학번", "이름", "선호하는전공", "고향" };

        String[][] data = { { ++n + "", "PJH", "전자제어", "거제" }, { ++n + "", "강민정", "피피티", "부산" },
                { ++n + "", "강순정", "롤", "서울" }, { ++n + "", "강민수", "농구", "마산" } };

        DefaultTableModel tm = new DefaultTableModel(data, columnName);

        table = new JTable(tm);

        JScrollPane sp = new JScrollPane(table);
        add(sp);

        addBtn = new JButton("addBtn");
        delBtn = new JButton("delBtn");

        JPanel southPanel = new JPanel();
        southPanel.add(addBtn);
        southPanel.add(delBtn);

        JLabel nameLabel = new JLabel("Name");
        nameField = new JTextField(10);

        JLabel telLabel = new JLabel("phoneNumber");
        telCombo = new JComboBox();

        telCombo.addItem("010");
        telCombo.addItem("011");
        telCombo.addItem("012");
        telCombo.addItem("013");
        telCombo.addItem("014");

        JLabel addressLabel = new JLabel("Address");
        addressField = new JTextField(20);

        southPanel.add(nameLabel);
        southPanel.add(nameField);
        southPanel.add(telLabel);
        southPanel.add(telCombo);
        southPanel.add(addressLabel);
        southPanel.add(addressField);

        add("South", southPanel);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("추가버튼을 누르셨습니다.");

                DefaultTabelModel tm = (DefaultTabelModel) table.getModel();
                String[] ar = { ++n + "", nameField.getText(), (String) telCombo.getSelectedItem(),
                        addressField.getText() };
                tm.addRow(ar);
            }
        });

        delBtn.addActionListener(new EventHandler(table));

        this.setDefaultCloseOperation(EXIT_ON_CLOSER);
        setBounds(100, 100, 800, 400);
        this.setVisible(true);
    }
}
