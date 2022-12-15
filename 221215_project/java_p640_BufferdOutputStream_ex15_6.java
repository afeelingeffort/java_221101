import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class java_p640_BufferdOutputStream_ex15_6 {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("123.txt"); // 123.txt가 어디서 만들어지는지 모르겠음. 파일명 123.txt로 만들어도 결과 출력
                                                                    // 안 됨.
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);

            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }

            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}