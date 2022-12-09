interface MyFunction3 {
    void print();
}

public class google_LambdaExpression_NonPrameter {
    public google_LambdaExpression_NonPrameter() {
        MyFunction3 fprint = () -> {
            System.out.println("Hello World");
        };
        fprint.print();
    }

    public static void main(String[] args) {
        new google_LambdaExpression_NonPrameter();
    }

}
