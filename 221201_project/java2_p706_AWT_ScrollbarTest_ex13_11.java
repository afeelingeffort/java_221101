import java.awt.Frame;
import java.awt.Scrollbar;

public class java2_p706_AWT_ScrollbarTest_ex13_11 {

    public static void main(String[] args) {
        Frame f = new Frame("Scrollbar");
        f.setSize(300, 200);
        f.setLayout(null);

        Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
        hor.setSize(100, 15);
        hor.setLocation(60, 30);
        Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
        ver.setSize(15, 100);
        ver.setLocation(30, 30);

        f.add(hor);
        f.add(ver);
        f.setVisible(true);
    }

}
