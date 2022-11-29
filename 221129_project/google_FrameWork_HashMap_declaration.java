import java.util.HashMap;

public class google_FrameWork_HashMap_declaration {

    public static void main(String[] args) {
        HashMap<String, String> m1 = new HashMap<String, String>();
        HashMap<String, String> m2 = new HashMap<>();
        HashMap<String, String> m3 = new HashMap<>(m1);
        HashMap<String, String> m4 = new HashMap<>(10);
        HashMap<String, String> m5 = new HashMap<>(10, 07f);
        HashMap<String, String> m6 = new HashMap<String, String>() {
            {
                put("a", "b"); // 초기값 지정.
            }
        };
    }

}
