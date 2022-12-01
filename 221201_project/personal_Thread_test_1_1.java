// 안 섞임. 
class Thread3 extends Thread {
    public void run() {

    }
}

class Thread3_1 implements Runnable {
    public void run() {

    }
}

public class personal_Thread_test_1_1 {

    public static void main(String[] args) {
        // Thread3 t=new Thread3();
        //
        // Runnable r=new Thread3_1();
        // Thread t2=new Thread(r);
        //
        for (int i = 0; i < 100; i++) {
            System.out.print(0);
        }

        for (int i = 0; i < 100; i++) {
            System.out.print(1);
        }
    }
}