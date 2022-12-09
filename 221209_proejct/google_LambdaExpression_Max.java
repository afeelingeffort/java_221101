
public class google_LambdaExpression_Max {
    public interface MyNuber {
        int getMax(int num1, int num2);
    }

    public static void main(String[] args) {
        MyNuber max = (x, y) -> (x >= y) ? x : y;
        System.out.println(max.getMax(10, 30));
    }

}
