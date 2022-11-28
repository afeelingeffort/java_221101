import java.util.LinkedList;
import java.util.Queue;

public class google_FrameWork_Queue_1 {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("data1");
        q.add("data2");
        q.offer("data3");

        System.out.println(q.poll());
        System.out.println(q.remove());
        q.clear();

    }

}
