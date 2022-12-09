
public class google_LambdaExpression_ThreadCall {

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }

}
