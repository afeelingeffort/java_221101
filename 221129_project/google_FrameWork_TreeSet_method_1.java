import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class google_FrameWork_TreeSet_method_1 {

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.remove(1);
        set.clear();
        System.out.println(set.size());

        TreeSet<Integer> set2 = new TreeSet<Integer>(Arrays.asList(4, 2, 3));
        System.out.println(set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.higher(3));
        System.out.println(set2.lower(3));

        Iterator iter = set2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

}
