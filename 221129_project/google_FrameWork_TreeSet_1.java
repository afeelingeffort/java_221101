import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class google_FrameWork_TreeSet_1 {

    public static void main(String[] args) {
        // 자동 정렬 !
        Set set = new TreeSet();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(r.nextInt(10));
        }
        System.out.println(set);
    }

}
