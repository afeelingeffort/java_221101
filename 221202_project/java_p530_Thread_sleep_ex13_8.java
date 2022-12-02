class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("-");
        System.out.print("<<th1 종료>>");
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            System.out.print("|");
        System.out.print("<<th2 종료>>");
    }
}

public class java_p530_Thread_sleep_ex13_8 {

    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();

        // try {
        // Thread.sleep(2000); //th1.sleep();은 main쓰레드를 잠들게 함. 무조건 delay와 sleep은
        // Thread.으로 호출할 것!
        // } catch(InterruptedException e) {}

        delay(2 * 1000);
        System.out.print("<<main 종료>>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(millis); // th1.sleep();은 main쓰레드를 잠들게 함. 무조건 delay와 sleep은 Thread.으로 호출할 것!
        } catch (InterruptedException e) {
        }
    }

}
