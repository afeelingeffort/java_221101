import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class java_p647_FileReader_FileWriter_ex15_8 {

    public static void main(String[] args) {
        try {
            String fileName = "test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;

            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
            fis.close();

            while ((data = fr.read()) != -1)
                System.out.println((char) data);
            System.out.println();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
