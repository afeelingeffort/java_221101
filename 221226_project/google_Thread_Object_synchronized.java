import java.lang.Thread;

class Sum {
    int num = 0;

    int sum() {
        for (int i = 0; i < 1000; i++) {
            num += 1;
        }
        return num;
    }

}

class ThreadEX implements Runnable {
    Sum s = new Sum();

    public void run() {
        String threadName = Thread.currentThread().getName();
        synchronized (s) {
            System.out.println(threadName + " : " + s.sum());
        }
    }

}

public class google_Thread_Object_synchronized {

    public static void main(String[] args) {
        Runnable r = new ThreadEX();
        Thread ex1 = new Thread(r, "a");
        Thread ex2 = new Thread(r, "b");

        ex1.start();
        ex2.start();
    }

}