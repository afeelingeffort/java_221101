import java.util.Random;
import java.util.stream.IntStream;

public class google_Stream_RandomClass {

    public static void main(String[] args) {
        IntStream intStream = new Random().ints(10, 5, 10);
        intStream
                // .limit(10)
                .forEach(System.out::println);
    }

}
