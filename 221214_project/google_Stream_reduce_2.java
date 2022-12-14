import java.util.Arrays;
import java.util.function.BinaryOperator;

public class google_Stream_reduce_2 implements BinaryOperator<String> {
    public String apply(String t, String u) {
        if (t.getBytes().length >= u.getBytes().length)
            return t;
        else
            return u;
    }

    public static void main(String[] args) {
        String[] lang = { "HTML5", "JavaScript", "JQuery", "Oracle", "JAVA" };

        System.out.println(Arrays.stream(lang).reduce("", (s1, s2) -> {
            if (s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else
                return s2;
        }));

        String str = Arrays.stream(lang).reduce(new google_Stream_reduce_2()).get();
        System.out.println(str);
    }

}
