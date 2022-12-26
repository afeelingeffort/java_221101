
class ThreadWithRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 실행 중인 스레드의 이름을 반환함.
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class google_Thread_Priority {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadWithRunnable2());
        Thread thread2 = new Thread(new ThreadWithRunnable2());

        thread2.setPriority(10);
        thread1.start();
        thread2.start();

        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
    }
}
