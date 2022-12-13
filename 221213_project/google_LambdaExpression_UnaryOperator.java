import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class google_LambdaExpression_UnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (num) -> num;
        int result1 = unaryOperator.apply(1);
        System.out.println(result1);

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;
        int result2 = binaryOperator.apply(1, 2);
        System.out.println(result2);
    }

}
