
public class google_Thread_synchronized_1 {
    public static void main(String[] args) {
        PrintDemo demo = new PrintDemo();

        ThreadDemo t1 = new ThreadDemo("1번 쓰레드", demo);
        ThreadDemo t2 = new ThreadDemo("2번 쓰레드", demo);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Interrupted");
        }
    }
}

class PrintDemo {
    public void printCount() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter   ---   " + i);
            }
        } catch (Exception e) {
            System.out.println("쓰레드 중단");
        }
    }
}

class ThreadDemo extends Thread {
    private Thread thread;
    private String threadName;
    PrintDemo demo;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        demo = pd;
    }

    public void run() {
        demo.printCount();
        System.out.println("Thread " + threadName + " 종료");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}