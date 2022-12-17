import java.io.*;

public class java2_p842_StandardIO_ex14_23 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("text.txt");
            ps = new PrintStream(fos);
            System.setOut(ps);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        System.out.println("Hello by System.out");
        System.out.println("Hello by System.err");
    }
}
