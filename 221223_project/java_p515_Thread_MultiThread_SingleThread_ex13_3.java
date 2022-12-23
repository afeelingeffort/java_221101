
public class java_p515_Thread_MultiThread_SingleThread_ex13_3 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("-"));

        System.out.print(
                "소요시간1:" + (System.currentTimeMillis() - java_p515_Thread_MultiThread_SingleThread_ex13_3.startTime));
    }

}

class ThreadEx3_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.printf("%s", new String("|"));

        System.out.print(
                "소요시간2:" + (System.currentTimeMillis() - java_p515_Thread_MultiThread_SingleThread_ex13_3.startTime));
    }
}