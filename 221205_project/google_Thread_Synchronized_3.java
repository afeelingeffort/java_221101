
public class google_Thread_Synchronized_3 {

    public static void main(String[] args) {
        MyThread2[] mts = new MyThread2[5];
        for (int i = 0; i < mts.length; i++) {
            mts[i] = new MyThread2();
            mts[i].start();
        }
    }

}

class MyThread2 extends Thread {
    public static int number = 0;
    public static Object lock = new Object();

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 5; i++) {
                number = number + 1;
                System.out.print(i);
            }

            System.out.println(":" + number + "-" + this.getName());
        }
    }
}