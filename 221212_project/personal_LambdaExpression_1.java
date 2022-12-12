
public class personal_LambdaExpression_1 {

    public static void main(String[] args) {
        // Object obj=(a, b)->a>b?a:b;
        Object obj = new Object() {
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int value = obj.max(3, 5); // obj리모콘에는 max가 없기 때문에 에러가 남.
    }

}
