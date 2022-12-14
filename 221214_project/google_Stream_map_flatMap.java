import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class google_Stream_map_flatMap {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "java", "wolrd");

        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        Stream<String[]> str1 = Stream.of(
                new String[] { "hello", "java", "world" },
                new String[] { "hong", "gildong" });

        str1.flatMap(Arrays::stream).forEach(System.out::println);

        Stream<String[]> str2 = Stream.of(
                new String[] { "hello", "java", "world" },
                new String[] { "hong", "gildong" });

        str2.map(Arrays::stream).forEach(System.out::println);
    }

}
