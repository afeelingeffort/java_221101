
public class google_Thread_Sample_1 extends Thread {
    public void run() {
        System.out.println("thread run");
    }

    public static void main(String[] args) {
        google_Thread_Sample_1 sample = new google_Thread_Sample_1();
        sample.start();
    }

}
