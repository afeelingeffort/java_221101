//오..!
public class google_LambdaExpression_RunnableInstance {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(i);
            }
        };

        Thread th = new Thread(r);
        th.start();
    }

}
