
public class java2_p651_suspend_stop_resume_ThreadEx17 {

    public static void main(String[] args) {
        RunImplEx17 r1 = new RunImplEx17();
        RunImplEx17 r2 = new RunImplEx17();
        RunImplEx17 r3 = new RunImplEx17();

        Thread th1 = new Thread(r1, "*");
        Thread th2 = new Thread(r1, "**");
        Thread th3 = new Thread(r1, "***");

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

class RunImplEx17 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    public void run() {
        while (!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        }

        System.out.println(Thread.currentThread().getName() + "- stopped");
    }

    public void suspend() {
        suspended = true;
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
    }
}