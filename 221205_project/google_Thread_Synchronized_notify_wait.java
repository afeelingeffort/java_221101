
public class google_Thread_Synchronized_notify_wait {

    public static void main(String[] args) {
        SynchThread synchThread = new SynchThread();
        synchThread.start();

        synchronized (synchThread) {
            System.out.println("synchThread가 완료될 때까지 기다린다.");

            try {
                synchThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total Sum: " + synchThread.total);
        }
    }

}

class SynchThread extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i + "를 더한다.");
                total += i;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
}
