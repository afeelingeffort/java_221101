
public class java_p548_Thread_Excercise13_1 {

    public static void main(String[] args) {
        Thread1 r = new Thread1();
        Thread th1 = new Thread(r);

        th1.start();
    }

}

class Thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}