
public class google_Thread_NonSynchronized_1 {

    public static void main(String[] args) {
        source src = new source();

        add ad1 = new add(1, src);
        add ad2 = new add(2, src);

        ad1.start();
        ad2.start();
    }

}

class add extends Thread {
    private source sc;
    int id;

    public add(int id, source sc) {
        this.sc = sc;
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            sc.add(id, 50);
        }
    }
}

class source {
    private int sum = 0;

    public void add(int id, int a) {
        int tmp = sum;
        System.out.println("[" + id + "] 현재 값은 " + tmp + "입니다.");

        tmp = tmp + a;
        System.out.println("[" + id + "] 현재 값은 " + tmp + "입니다.");

        sum = tmp;
    }
}