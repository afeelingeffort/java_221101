import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
//import java.io.*;

public class java_p632_InputStream_OutputStream_ex15_3 {

    public static void main(String[] args) {
        byte[] inSrc = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        System.out.println("Input Source:" + Arrays.toString(inSrc));

        try {
            while (input.available() > 0) {
                // input.read(temp);
                // output.write(temp); //마지막 Output Source에서 6,7이 출력됨. 기존의 내용을 덮어씀.

                int len = input.read(temp);
                output.write(temp, 0, len); // 마지막 Output Source에 6,7 출력 안 됨.

                outSrc = output.toByteArray();
                printArrays(temp, outSrc);
            }
        } catch (IOException e) {
        }
    }

    static void printArrays(byte[] temp, byte[] outSrc) {
        System.out.println("temp:" + Arrays.toString(temp));
        System.out.println("Output Source:" + Arrays.toString(outSrc));
    }

}
