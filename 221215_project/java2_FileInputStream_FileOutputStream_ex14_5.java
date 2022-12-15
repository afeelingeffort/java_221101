import java.io.*;

public class java2_FileInputStream_FileOutputStream_ex14_5 {
    public static void main(String[] args) {
        FileInputStream fis = new FileInputStream(args[0]);
        int data = 0;
        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }
    }
}