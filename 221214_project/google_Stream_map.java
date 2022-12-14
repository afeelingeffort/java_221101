import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class google_Stream_map {

    public static void main(String[] args) {
        /*
         * Member[] members= {
         * new Member("김"),
         * new Member("이"),
         * new Member("박"),
         * new Member("최")
         * };
         * 
         * Stream<Member> memberStream=Stream.of(members);
         * memberStream.map(member->member.getName()).forEach(System.out::println);
         */

        List<String> list = Arrays.asList("Apple", "Cherry", "Orange");
        Stream<String> stream = list.stream();

        stream.map(s -> s.toUpperCase()).forEach(System.out::println);
    }

}
