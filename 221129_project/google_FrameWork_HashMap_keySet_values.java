import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class google_FrameWork_HashMap_keySet_values {

    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("apple", 1);
        fruits.put("banana", 2);
        fruits.put("kiwi", 3);
        System.out.println("keySet(): " + fruits.keySet());
        System.out.println("values(): " + fruits.values());

        Set<String> keys = fruits.keySet();
        for (String key : keys) {
            System.out.println("key: " + key);
        }

        Collection<Integer> values = fruits.values();
        for (Integer value : values) {
            System.out.println("value: " + value);
        }
    }

}
