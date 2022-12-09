interface MyFunction1_1 {
    int calc(int x, int y);
}

public class google_LambdaExpression_1 {
    public google_LambdaExpression_1() {
        // MyFunction f=new MyFunction() {
        //
        // public int calc(int x, int y) {
        // return x+y;
        // }
        // };

        MyFunction1_1 f1 = (x, y) -> {
            return x + y;
        };
        System.out.println("f1의 결과:" + f1.calc(22, 100));

        MyFunction1_1 f2 = (x, y) -> {
            return x - y;
        };
        System.out.println("f2의 결과:" + f2.calc(99, 9));
    }

    public static void main(String[] args) {
        new google_LambdaExpression_1();
    }
}
