import java.util.Iterator;
import java.util.TreeSet;

public class google_SortedSetInterface_TreeSet {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("Hello");
        ts.add("World");
        ts.add("Hello");
        ts.add("hahaha");
        ts.add("GoodNight");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

}
