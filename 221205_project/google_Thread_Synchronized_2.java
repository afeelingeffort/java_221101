
public class google_Thread_Synchronized_2 {

    public static void main(String[] args) {
        StringDisplay sd = new StringDisplay();
        MyThread[] mts = new MyThread[5];
        for (int i = 0; i < mts.length; i++) {
            mts[i] = new MyThread(sd, Integer.toString(i));
            mts[i].start();
        }
    }

}

class StringDisplay {
    synchronized void display(String s) {
        for (int i = 0; i < 5; i++)
            System.out.print(s);

        System.out.println("");
    }
}

class MyThread extends Thread {
    StringDisplay sd;
    String s = "";

    public MyThread(StringDisplay sd, String s) {
        this.sd = sd;
        this.s = s;
    }

    public void run() {
        sd.display(s);
    }
}