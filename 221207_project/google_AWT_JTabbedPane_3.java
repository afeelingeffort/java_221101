import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JPanel011 extends JPanel {
    private JButton jb1;
    private JScrollPane jsp1;
    private JTextArea jta1;

    public JPanel011() {
        setLayout(null);

        jb1 = new JButton("버튼");
        jb1.setSize(70, 20);
        jb1.setLocation(10, 10);
        add(jb1);

        jta1 = new JTextArea();

        jsp1 = new JScrollPane(jta1); // 스크롤 보이게.
        jsp1.setSize(200, 150);
        jsp1.setLocation(10, 40);
        add(jsp1);
    }
}

class JPanel022 extends JPanel {
    private JTextField tf;
    private JPasswordField pwf;

    public JPanel022() {
        setLayout(null);

        JLabel lb1 = new JLabel("아이디");
        lb1.setBounds(31, 40, 67, 15);
        add(lb1);

        tf = new JTextField();
        tf.setBounds(123, 40, 116, 21);
        add(tf);
        tf.setColumns(10);

        JLabel lb2 = new JLabel("암호");
        lb2.setBounds(31, 84, 67, 15);
        add(lb2);

        pwf = new JPasswordField();
        pwf.setBounds(123, 84, 116, 21);
        add(pwf);

        JButton btn = new JButton("버튼");
        btn.setSize(70, 20);
        btn.setLocation(10, 10);
        add(btn);
    }
}

class JPanel033 extends JPanel {
    private JLabel labelName;
    private JLabel labelSex;
    private JLabel labelHobby;
    private JLabel labelNation;
    private JLabel labelIntroduce;

    private JTextField tfName;

    private JRadioButton radioBoy;
    private JRadioButton radioGirl;
    private JRadioButton[] sex = new JRadioButton[2];
    private String sexx = "";

    private JCheckBox[] checkBox = new JCheckBox[3];
    private JCheckBox checkMovie;
    private JCheckBox checkReding;
    private JCheckBox checkCicle;
    private String[] check = { "", "", "" };

    private JComboBox comboNation;
    private String[] nationList = { "한국", "영국", "미국", "중국", "일본", "독일", "브라질", "스페인", "스웨덴" };

    private JTextArea taIntroduce;
    private JButton buttonSave;

    public JPanel033() {
        setLayout(null);

        labelName = new JLabel("이름");
        labelName.setSize(100, 20);
        labelName.setLocation(20, 50);
        labelSex = new JLabel("성별");
        labelSex.setBounds(20, 100, 100, 20);
        labelHobby = new JLabel("취미");
        labelHobby.setBounds(20, 150, 100, 20);
        labelNation = new JLabel("국가");
        labelNation.setBounds(20, 150, 100, 20);
        labelIntroduce = new JLabel("소개");
        labelIntroduce.setBounds(20, 250, 100, 20);

        tfName = new JTextField();
        tfName.setBounds(100, 50, 200, 20);

        ButtonGroup bg = new ButtonGroup();
        sex[0] = new JRadioButton("남");
        sex[0].setBounds(100, 100, 50, 20);
        sex[1] = new JRadioButton("여");
        sex[1].setBounds(200, 100, 100, 20);
        bg.add(sex[0]);
        bg.add(sex[1]);

        checkBox[0] = new JCheckBox("영화");
        checkBox[0].setBounds(100, 150, 60, 20);
        checkBox[1] = new JCheckBox("독서");
        checkBox[1].setBounds(160, 150, 60, 20);
        checkBox[2] = new JCheckBox("자전거");
        checkBox[2].setBounds(220, 150, 80, 20);

        comboNation = new JComboBox(nationList);
        comboNation.setBounds(100, 200, 80, 20);

        taIntroduce = new JTextArea();
        taIntroduce.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(taIntroduce);
        scrollPane.setBounds(100, 255, 200, 150);

        buttonSave = new JButton("저장");
        buttonSave.setBounds(150, 430, 100, 20);
        buttonSave.addActionListener(new EventHandlerSave());

        add(labelName);
        add(labelSex);
        add(labelHobby);
        add(labelNation);
        add(labelIntroduce);
        add(tfName);

        add(sex[0]);
        add(sex[1]);

        add(checkBox[0]);
        add(checkBox[1]);
        add(checkBox[2]);

        add(comboNation);

        add(scrollPane);
        add(buttonSave);
    }

    class EventHandlerSave implements ActionListener {
        public void actionPerfored(ActionEvent e) {
            String a = tfName.getText();

            if (sex[0].isSelected())
                sexx = "남";
            else if (sex[1].isSelected())
                sexx = "여";

            if (checkBox[0].isSelected())
                check[0] = "영화";
            else
                check[0] = "";
            if (checkBox[1].isSelected())
                check[1] = "독서";
            else
                check[1] = "";
            if (checkBox[2].isSelected())
                check[2] = "자전거";
            else
                check[2] = "";

            String d = (String) comboNation.getSelectedItem();

            taIntroduce.append("이름=" + a + "\n");
            taIntroduce.append("성별=" + sexx + "\n");
            taIntroduce.append("취미=" + check[0] + check[1] + check[2] + "\n");
            taIntroduce.append("국가=" + d + "\n");
        }
    }
}

public class google_AWT_JTabbedPane_3 extends JFrame {
    public JPanel011 jpl011 = null;
    public JPanel022 jpl022 = null;
    public JPanel033 jpl033 = null;

    public static void main(String[] args) {
        google_AWT_JTabbedPane_3 win = new google_AWT_JTabbedPane_3();
        win.setTitle("frame test");
        win.jpl011 = new JPanel011();
        win.jpl022 = new JPanel022();
        win.jpl033 = new JPanel033();

        JTabbedPane jtab = new JTabbedPane();

        jtab.addTab("화면1", win.jpl011);
        jtab.addTab("화면2", win.jpl022);
        jtab.addTab("화면3", win.jpl033);

        win.add(jtab);

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setSize(500, 700);
        win.setVisible(true);
    }

}
