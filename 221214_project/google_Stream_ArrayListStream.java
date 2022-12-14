import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class google_Stream_ArrayListStream {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("HI");
        strList.add("Hello");
        strList.add("World");

        Stream<String> stream = strList.stream();
        stream.forEach(s -> System.out.println(s));
        System.out.println();

        strList.stream().sorted().forEach(s -> System.out.println(s));
        strList.stream().sorted().forEach(System.out::println);
    }

}
