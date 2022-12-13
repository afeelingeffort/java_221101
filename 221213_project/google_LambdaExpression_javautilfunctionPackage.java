import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class google_LambdaExpression_javautilfunctionPackage {

    public static void main(String[] args) {
        Supplier<String> s = () -> "String";
        System.out.println(s.get());

        Consumer<Integer> c = (num) -> System.out.println(num + 1);
        c.accept(1);

        Function<Integer, Integer> f = (num) -> num + 1;
        int result1 = f.apply(1);
        System.out.println(result1);

        Function<String, Integer> f2 = String::length;
        int result2 = f2.apply("Hello Wolrd");
        System.out.println(result2);

        Predicate<Integer> p = (num) -> num > 0;
        boolean result3 = p.test(1);
        System.out.println(result3);
    }

}
