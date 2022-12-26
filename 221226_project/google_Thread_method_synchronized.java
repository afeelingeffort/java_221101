import java.lang.Thread;

class Sum2 {
       int num = 0;

       synchronized int sum() {
              for (int i = 0; i < 1000; i++) {
                     num += 1;
              }
              return num;
       }

}

class ThreadEX2 extends Thread {
       Sum2 s = new Sum2();

       public void run() {
              String threadName = Thread.currentThread().getName();
              System.out.println(threadName + " : " + s.sum());
       }

}

public class google_Thread_method_synchronized {

       public static void main(String[] args) {
              ThreadEX2 r = new ThreadEX2();
              Thread ex1 = new Thread(r, "a");
              Thread ex2 = new Thread(r, "b");

              ex1.start();
              ex2.start();
       }

}
