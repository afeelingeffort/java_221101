import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class google_GUI_JTable_JTextField_3 extends JFrame implements MouseListener, KeyListener {
    private final String[] labels = { "Name", "Age", "Sex", "Korean", "English", "Math" };
    private JTextField[] fields = new JTextField[6];

    private JScrollPane scrolledTable;
    private JTable table;

    private JButton addBtn;
    private JButton delBtn;

    public google_GUI_JTable_JTextField_3(String title) {
        this.setLayout(new BorderLayout(10, 10));

        JPanel topPanel = new JPanel(new GridLayout(6, 4, 10, 5));

        for (int i = 0; i < 6; i++) {
            topPanel.add(new JLabel(labels[i]));
            fields[i] = new JTextField(30);
            topPanel.add(fields[i]);
        }

        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add("North", topPanel);

        String header[] = { "Name", "Age", "Sex", "Korean", "English", "Math" };
        DefaultTableModel model = new DefaultTableModel(header, 0);

        table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrolledTable = new JScrollPane(table);
        scrolledTable.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.add("Center", scrolledTable);

        JPanel rightPanel = new JPanel(new GridLayout(5, 1, 10, 10));

        addBtn = new JButton("Add record");
        addBtn = new JButton("Del record");

        rightPanel.add(addBtn);
        rightPanel.add(delBtn);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        this.add("East", rightPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(620, 400);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        addBtn.addMouseListener(this);
        delBtn.addMouseListener(this);
        for (int i = 0; i < 6; i++)
            fields[i].addKeyListener(this);
        table.addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public void addRecord() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String[] record = new String[6];
        for (int i = 0; i < 6; i++) {
            if (isInvalidInput(fields[i].getText())) {
                System.out.println("Invalid Input");
                return;
            }
            record[i] = fields[i].getText();
        }
        model.addRow(record);
    }

    private boolean isInvalidInput(String input) {
        return input == null || input.length() == 0;
    }

    public static void main(String[] args) {
        new google_GUI_JTable_JTextField_3();
    }

}
