
// click이벤트로 계산기 만들어보기.
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.util.Scanner;

public class personal_AWT_calc_utilize {

    public void calc() {
        Scanner scn2 = new Scanner(System.in);

        int op1;
        int op2;
        String operator;

        while (true) {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            op1 = scn2.nextInt();
            System.out.print("연산자를 입력하세요. (+, -, *, /, %) : ");
            operator = scn2.next();
            System.out.print("두 번째 정수를 입력하세요 : ");
            op2 = scn2.nextInt();

            if (operator.equals("+")) {
                System.out.println(op1 + op2);
            } else if (operator.equals("-")) {
                System.out.println(op1 - op2);
            } else if (operator.equals("*")) {
                System.out.println(op1 * op2);
            } else if (operator.equals("/")) {
                System.out.println(op1 / op2);
            } else if (operator.equals("%")) {
                System.out.println(op1 % op2);
            }

            System.out.print("continue?");
            if (scn2.next().equals("no") == true)
                break;
        }
    }

    public static void main(String[] args) {
        Frame f = new Frame("계산기");
        TextField tf = new TextField("0");
        tf.setEditable(false);
        f.setSize(190, 160);
        f.setLocation(300, 300);

        f.add("North", tf);
        Panel numPanel = new Panel();
        Button[] numButtons = null;
        numPanel.setLayout(new GridLayout(4, 5, 4, 4));
        numPanel.setBackground(Color.lightGray);
        f.add("Center", numPanel);

        String numStr[] = { "7", "8", "9", "/", " CE ",
                "4", "5", "6", "*", " BS ",
                "1", "2", "3", "-", "1/x",
                "0", "+/-", ".", "+", "=" };

        numButtons = new Button[numStr.length];
        for (int i = 0; i < numStr.length; i++) {
            numButtons[i] = new Button(numStr[i]);
            numButtons[i].setForeground(Color.blue);
            numPanel.add(numButtons[i]);
        }

        f.setResizable(false);
        f.setVisible(true);
    }

}
