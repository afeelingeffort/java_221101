import java.util.Arrays;

public class google_Stream_IntArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int sumValue = Arrays.stream(arr).sum();
        System.out.println(sumValue);

        int cnt = (int) Arrays.stream(arr).count();
        System.out.println(cnt);
    }

}
