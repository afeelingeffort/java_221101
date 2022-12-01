//무작위로 섞여서 출력됨. 실행결과가 매번 다름. 
class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.print(0);
    }
}

class Thread2_1 implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.print(1);
    }
}

public class personal_Thread_test_1 {

    public static void main(String[] args) {
        Thread2 t = new Thread2();

        Runnable r = new Thread2_1();
        Thread t2 = new Thread(r);

        t.start();
        t2.start();
    }

}
