import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class google_FrameWork_HashMap_1 {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("1", "Hello1");
        hm.put("2", "World2");
        hm.put("3", "Hello3");
        hm.put("4", "World4");

        Iterator<Entry<String, String>> iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println("---------------------------");

        Iterator<String> iter2 = hm.keySet().iterator();
        while (iter2.hasNext()) {
            String key = iter2.next();
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
    }

}
