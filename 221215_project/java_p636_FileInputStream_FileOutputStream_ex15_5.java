
//실행 안 됨. Package Explorer에서 F5눌러도 안 됨. 
//아 이클립스에선 안 됐는데 비쥬얼코드에서는 파일 생성도 되고 코드도 실행됨
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_p636_FileInputStream_FileOutputStream_ex15_5 {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(args[0]);
            FileOutputStream fos = new FileOutputStream(args[1]);

            int data = 0;
            while ((data = fis.read()) != -1)
                fos.write(data);

            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
