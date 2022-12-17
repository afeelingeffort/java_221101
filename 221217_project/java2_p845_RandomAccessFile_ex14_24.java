import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class java2_p845_RandomAccessFile_ex14_24 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("test.dat", "rw");
            System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
            raf.writeInt(100);
            System.out.println("파일 포인터의 위치: " + raf.getFilePointer());
            raf.writeLong(100L);
            System.out.println("파일 토인터의 위치: " + raf.getFilePointer());

            raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
