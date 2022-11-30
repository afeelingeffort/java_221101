import java.awt.Button;
import java.awt.Frame;

public class java2_p693_AWT_ButtonTest_ex13_3 {

    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);

        Button b = new Button("확 인");
        b.setSize(100, 50);

        f.add(b);
        f.setVisible(true);
    }

}
