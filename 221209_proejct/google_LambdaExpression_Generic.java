interface MyFunction5<T> {
    void println(T x);
}

public class google_LambdaExpression_Generic {
    public google_LambdaExpression_Generic() {
        MyFunction5<String> f1 = x -> {
            System.out.println(x.toString());
        };
        f1.println("String Generic 사용 람다식");
        f1.println("Hello World");

        MyFunction5<Integer> f2 = x -> {
            System.out.println(x.toString());
        };
        f2.println(Integer.valueOf(100));
    }

    public static void main(String[] args) {
        new google_LambdaExpression_Generic();
    }

}
