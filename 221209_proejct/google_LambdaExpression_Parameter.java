interface MyFunction4 {
    int calc(int x, int y);
}

public class google_LambdaExpression_Parameter {
    static void printMultiply(int x, int y, MyFunction4 f) {
        System.out.println("실행결과:" + f.calc(x, y));
    }

    public google_LambdaExpression_Parameter() {
        printMultiply(100, 100, (x, y) -> {
            return x * y;
        });
    }

    public static void main(String[] args) {
        new google_LambdaExpression_Parameter();
    }

}
