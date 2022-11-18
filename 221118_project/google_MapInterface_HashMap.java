import java.util.HashMap;
import java.util.Map;

public class google_MapInterface_HashMap {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Hello");
        hm.put(2, "World");
        hm.put(3, "wow");

        System.out.println("Value for 1 is " + hm.get(1));

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }

}
