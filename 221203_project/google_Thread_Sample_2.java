//0에서 10까지 순차적으로 안 나오고 뒤죽박죽 나오는 게 쓰레드 특징때문이겠지..?

public class google_Thread_Sample_2 extends Thread {
    int seq;

    public google_Thread_Sample_2(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }

        System.out.println(this.seq + " thread end");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new google_Thread_Sample_2(i);
            t.start();
        }

        System.out.println("main end");
    }

}
