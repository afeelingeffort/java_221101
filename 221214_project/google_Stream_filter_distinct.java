import java.util.Arrays;
import java.util.List;

public class google_Stream_filter_distinct {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "a", "b", "b", "c", "c");

        list.stream().distinct().forEach(System.out::print);
        System.out.println();
        list.stream().filter(str -> str.equals("a")).forEach(System.out::print);
        System.out.println();
        list.stream().distinct().filter(str -> str.equals("a")).forEach(System.out::print);
    }

}
