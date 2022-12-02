
public class google_Thread_Method_1 {
    static int num;

    public static void main(String[] args) {
        Thread1 th1 = new Thread1(1, 1, 3);
        Thread1 th2 = new Thread1(2, 4, 6);
        Thread1 th3 = new Thread1(3, 7, 10);

        th1.start();
        th2.start();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("더하기 작업이 완료되었습니다. 모든 수를 더한 값은 " + th1.getAddNum() + " 입니다.");
    }

}

class Thread1 extends Thread {
    static int all_add_num = 0;
    int add_num = 0;

    int thread_num = 0;
    int start = 0;
    int end = 0;

    Thread1(int thread_num, int start, int end) {
        this.thread_num = thread_num;
        this.start = start;
        this.end = end;
    }

    public void run() {
        try {
            for (int i = start; i <= end; i++) {
                System.out.println("쓰레드 ID " + this.thread_num + " :: i 값: " + i);
                add_num = add_num + i;
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        setTPS(add_num);
    }

    public void setTPS(int num) {
        all_add_num = all_add_num + num;
    }

    public int getAddNum() {
        return all_add_num;
    }
}