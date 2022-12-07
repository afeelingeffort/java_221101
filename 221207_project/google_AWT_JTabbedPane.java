import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class google_AWT_JTabbedPane extends JFrame {
    JTabbedPane jt = new JTabbedPane();

    JPanel jp = new JPanel();

    JButton btn1 = new JButton("탭 연습1");
    JButton btn2 = new JButton("탭 연습2");
    JButton btn3 = new JButton("탭 연습3");
    JTextField txt_1 = new JTextField("기본값", 25);

    public google_AWT_JTabbedPane() {
        super("TabTitleTextPosition");

        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        jp.add(txt_1);

        jt.add("기록 일지", new JTextArea());
        jt.add("상태 보기", jp);
        jt.add("회원정보변경", new JTextArea());
        jt.add("About", new JTextArea());

        add(jt);

        setSize(450, 350);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new google_AWT_JTabbedPane();
    }

}
