
public class google_Thread_Runnable_sum implements Runnable {
    public void run() {
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            sum += index;
            System.out.println(sum);
        }

        System.out.println(Thread.currentThread() + "최종 합 : " + sum);
    }

    public static void main(String[] args) {
        Runnable sum = new google_Thread_Runnable_sum();
        Thread th1 = new Thread(sum);
        Thread th2 = new Thread(sum);
        th1.start();
        th2.start();
    }

}
