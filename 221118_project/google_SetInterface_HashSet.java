import java.util.HashSet;
import java.util.Iterator;

public class google_SetInterface_HashSet {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        hs.add("Hello");
        hs.add("World");
        hs.add("Hello");
        hs.add("hahaha");
        hs.add("cool");

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

}
