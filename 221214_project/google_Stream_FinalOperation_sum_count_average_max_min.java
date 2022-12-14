import java.util.Arrays;

public class google_Stream_FinalOperation_sum_count_average_max_min {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        long count = Arrays.stream(arr).count();
        System.out.println(count);

        long sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println(avg);

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

        int min = Arrays.stream(arr).min().getAsInt(); // getAsType()을 안 쓰면 안되군
        System.out.println(min);
    }

}
