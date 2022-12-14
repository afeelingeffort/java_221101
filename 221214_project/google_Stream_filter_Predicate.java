import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class google_Stream_filter_Predicate {

    public static void main(String[] args) {
        // List<String> list2=List.of("kim", "choi", "lee", "hwang"); 아진짜 왜 안됨 너무
        // 화난네네네ㅔㄴㄹㄹ ㅗㅑ전ㄷ ㅗㄿㄴ냐ㅣㅏㅓㅜㅅㅎㄹ4ㄱㄷㅍㅋ 포
        List<String> list = Arrays.asList("kim", "choi", "lee", "hwang");
        list.stream().filter(s -> s.length() == 5);

        list.stream().filter(new Predicate<String>() {
            public boolean test(String s) {
                return s.length() == 5;
            }
        });

        System.out.println(list);
    }

}
