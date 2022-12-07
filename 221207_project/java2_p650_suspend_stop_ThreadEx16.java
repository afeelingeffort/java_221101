
public class java2_p650_suspend_stop_ThreadEx16 {

    public static void main(String[] args) {
        RunImplEx16 r = new RunImplEx16();
        Thread th1 = new Thread(r, "*");
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");

        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {
        }
    }

}

class RunImplEx16 implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}