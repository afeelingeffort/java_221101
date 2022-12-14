import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class google_Stream_filter_map_limit_collect {

    public static void main(String[] args) {
        // List<String> list=List.of("a", "ab", "abc", "abcd");
        List<String> list = Arrays.asList("a", "ab", "abc", "abcd");

        List<String> result = list.stream()
                .filter(x -> {
                    System.out.println(x + " in filter method");
                    return x.length() >= 2;
                }).map(x -> {
                    System.out.println(x + " in map method");
                    return x.toUpperCase();
                }).limit(2)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
