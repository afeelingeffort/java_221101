
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class google_FrameWork_ArrayList_2 {

    public static void main(String[] args) {
        // ArrayList 출력
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));

        System.out.println(list.get(0));

        for (Integer i : list) {
            System.out.println(i);
        }

        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next());
        }

        // ArrayList 값 검색
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(1));
    }

}
