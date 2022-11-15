import java.util.StringJoiner;

public class java_p337_java_lang_package_StringJoiner {

    public static void main(String[] args) {
        String animals = "dog, cat, bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[", "]");

        for (String s : arr) {
            sj.add(s);
        }

        System.out.println(sj.toString());
    }

}
