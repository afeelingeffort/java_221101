//데몬 쓰레드는 메인 쓰레드가 끝나면 자동 종료되기 때문에 쓰레드가 시작하기 전에 써야한다. 
public class goole_Thread_DaemonThread extends Thread {
    public void run() {
        try {
            System.out.println("Daemon Thread Start");
            Thread.sleep(10000);
            System.out.println("Daemon Thread End");
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        goole_Thread_DaemonThread th = new goole_Thread_DaemonThread();

        th.setDaemon(true);
        th.start();
        System.out.println("Main Method End");
    }

}
