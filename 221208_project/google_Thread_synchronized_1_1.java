
public class google_Thread_synchronized_1_1 {

    public static void main(String[] args) {
        source2 src = new source2();

        add2 ad1 = new add2(1, src);
        add2 ad2 = new add2(2, src);

        ad1.start();
        ad2.start();
    }

}

class add2 extends Thread {
    private source2 sc;
    int id;

    public add2(int id, source2 sc) {
        this.id = id;
        this.sc = sc;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.add(id, 50);
        }
    }
}

class source2 {
    private int sum = 0;

    public synchronized void add(int id, int a) {
        int tmp = sum;
        System.out.println("[" + id + "] 현재 값은 " + tmp + "입니다.");

        tmp = tmp + a;
        System.out.println("[" + id + "] 더한 값은 " + tmp + "입니다.");

        sum = tmp;
    }
}