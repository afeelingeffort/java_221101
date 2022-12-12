import java.util.stream.Stream;

public class java_p574_IntStream_LongStream {

    public static void main(String[] args) {
        // iterate 단항연산자
        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);

        // generate 입력X 출력O
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.forEach(System.out::println);
    }

}
