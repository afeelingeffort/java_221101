import java.util.function.Predicate;

public class google_LambdaExpression_Predicate {

    public static void main(String[] args) {
        Predicate<Integer> p1 = (num) -> num > 10;
        Predicate<Integer> p2 = (num) -> num < 0;

        boolean result = p1.or(p2).test(5);
        System.out.println("5 :num<0 or num>10 ? " + result);

        result = p1.or(p2).test(10);
        System.out.println("15 :num<0 or num>10 ? " + result);

        result = p1.or(p2).test(-5);
        System.out.println("-5 :num<0 or num>10 ? " + result);
    }

}
