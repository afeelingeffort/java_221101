import java.util.stream.Stream;

public class java_p575_Stream_iterate_generate {

    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::print);

        System.out.println();
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::print);
    }

}
