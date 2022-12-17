import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class java2_p847_RandomAccessFile_ex14_26 {
    public static void main(String[] args) {
        int sum = 0;

        try {
            RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
            int i = 4;

            while (true) {
                raf.seek(i);
                sum += raf.readInt();
                i += 16;
            }
        } catch (EOFException e) {
            System.out.println("sum: " + sum);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
