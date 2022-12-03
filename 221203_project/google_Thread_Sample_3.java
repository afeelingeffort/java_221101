
public class google_Thread_Sample_3 extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(500);
                System.out.println("Thread: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        google_Thread_Sample_3 th1 = new google_Thread_Sample_3();
        google_Thread_Sample_3 th2 = new google_Thread_Sample_3();

        // th1.start(); 오오 이건 동시에 출력이 되고
        // th2.start();

        th1.run(); // 이건 순차적으로 출력됨.
        th2.run();
    }

}
