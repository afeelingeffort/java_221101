@FunctionalInterface
interface Math2 {
    public int Calc(int first, int second);
}

public class google_LambdaExpression_FuntionalInterface {

    public static void main(String[] args) {
        Math2 plusLambda = (first, second) -> first + second;
        System.out.println(plusLambda.Calc(4, 2));
        Math2 minusLambda = (first, second) -> first - second;
        System.out.println(minusLambda.Calc(3, 1));
    }

}
