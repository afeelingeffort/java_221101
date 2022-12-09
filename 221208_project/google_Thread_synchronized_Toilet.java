class Toilet {
    public void open(String name) {
        System.out.println(name + "이(가) 화장실 문을 연다.");
    }

    public void close(String name) {
        System.out.println(name + "이(가) 화장실 문을 닫는다.");
    }

    public void defecate(String name) {
        System.out.println(name + "이(가) 싼다.");
    }

    public synchronized void useToilet(String name) {
        open(name);
        defecate(name);
        close(name);
    }
}

class MyThread extends Thread {
    private String name;
    private Toilet toilet;

    public MyThread(String name, Toilet toilet) {
        this.name = name;
        this.toilet = toilet;
    }

    public void run() {
        toilet.useToilet(name);
    }
}

public class google_Thread_synchronized_Toilet {

    public static void main(String[] args) {
        Toilet toilet = new Toilet();
        MyThread th1 = new MyThread("철수", toilet);
        MyThread th2 = new MyThread("짱구", toilet);
        MyThread th3 = new MyThread("훈이", toilet);

        th1.start();
        th2.start();
        th3.start();
    }

}
