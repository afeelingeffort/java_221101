//왜 =========사이에 두개씩, 세개씩, 하나씩 찍히는지 이해가 안됨. 

public class google_Thread_MultiThread_1 {

    public static void main(String[] args) {
        ThreadEX thex = new ThreadEX();
        ThreadEX thex2 = new ThreadEX();
        Thread thread1 = new Thread(thex, "A");
        Thread thread2 = new Thread(thex2, "B");

        thread1.start();
        thread2.start();

        Thread.currentThread().getName();
    }

}

class ThreadEX implements Runnable {
    int TestNum = 0;

    public void run() {
        for (int i = 0; i < 10; i++) {
            if (Thread.currentThread().getName().equals("A")) {
                System.out.println("===============");
                TestNum++;
            }

            System.out.println("ThreadName= " + Thread.currentThread().getName() + "TestNum=" + TestNum);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}