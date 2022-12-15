import java.io.FileInputStream;
import java.io.IOException;

public class java_p635_FileInputStream_FileOutputStream_ex15_4 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(".\\src\\java_p635_FileInputStream_FileOutputStream_ex15_4.java");

        int data = 0;

        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.print(c);
        }
    }

}
