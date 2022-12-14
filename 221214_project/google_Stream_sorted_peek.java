import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class google_Stream_sorted_peek {

    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream1.sorted().forEach(System.out::println);

        // 람다식으로
        Stream<String> stream2 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream2.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);

        // Comparaor의 default메서드 comparing 사용
        Stream<String> stream3 = Stream.of("dd", "aa", "CC", "cc", "x");
        stream3.sorted(Comparator.comparing((i) -> i.length())).forEach(System.out::println);

        // peek
        int[] intArr = { 1, 2, 3, 4, 5 };

        int sum = Arrays.stream(intArr)
                .peek(s -> System.out.print(s))
                .sum();
        System.out.println();
        System.out.println(sum);

    }

}
