import java.awt.Button;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class google_GUI_JTabble_2 {

    public static void main(String[] args) {
        Dimension dim = new Dimension(430, 400);

        JFrame jf = new JFrame("table test");
        jf.setLocation(0, 0);
        jf.setPreferredSize(dim);
        jf.setLayout(null);

        String header[] = { "이름", "영어", "수학", "국어" };

        String contents[][] = {
                { "이정현", "50", "60", "70" },
                { "김영호", "70", "80", "75" },
                { "전수용", "80", "65", "95" },
                { "김진희", "80", "65", "95" },
                { "신정섭", "85", "60", "85" },
                { "김승현", "80", "65", "95" },
                { "김영석", "80", "65", "95" },
                { "이정석", "80", "65", "95" },
                { "이승근", "80", "65", "95" },
        };

        JTable table = new JTable(contents, header);

        JScrollPane jsp1 = new JScrollPane(table);

        jsp1.setLocation(0, 0);
        jsp1.setSize(300, 160);

        jf.add(jsp1);

        Button b1 = new Button("임시입력");
        b1.setLocation(10, 230);
        b1.setSize(70, 30);
        jf.add(b1);

        Button b2 = new Button("임시출력");
        b2.setLocation(80, 230);
        b2.setSize(70, 30);
        jf.add(b2);

        JLabel jl = new JLabel("SQL입력");
        jl.setLocation(10, 270);
        jl.setSize(100, 30);
        jf.add(jl);

        JTextField tf = new JTextField(10);
        tf.setLocation(10, 300);
        tf.setSize(400, 30);
        jf.add(tf);

        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
