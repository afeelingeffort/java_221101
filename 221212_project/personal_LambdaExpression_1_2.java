@FunctionalInterface
interface MyFunction2 {
    public abstract int max(int a, int b);
}

public class personal_LambdaExpression_1_2 {

    public static void main(String[] args) {
        // Object obj=(a, b)->a>b?a:b;
        /*
         * MyFunction2 f=new MyFunction2() {
         * public int max(int a, int b) {
         * return a>b? a:b;
         * }
         * };
         */

        MyFunction2 f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5);
        System.out.println("value=" + value);
    }

}
