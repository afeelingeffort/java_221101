
//버튼에 한글은 출력이 안 되는데, 영어는 출력이 됨. 
import java.awt.Button;
import java.awt.Frame;

public class java2_p694_AWT_ButtonTest2_ex13_4 {

    public static void main(String[] args) {
        Frame f = new Frame("Login");
        f.setSize(300, 200);
        f.setLayout(null);

        Button b = new Button("H I");
        b.setSize(100, 50);
        b.setLocation(100, 75);

        f.add(b);
        f.setVisible(true);
    }

}
