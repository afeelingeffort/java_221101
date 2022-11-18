import java.util.Iterator;
import java.util.LinkedHashSet;

public class google_SetInterface_LinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Hello");
        lhs.add("World");
        lhs.add("Hello");
        lhs.add("hahaha");
        lhs.add("bye");

        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

}
