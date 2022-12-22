import java.util.TreeSet;

public class java_p434_TreeSet_ex11_14 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to = "d";

        set.add("abc");
        set.add("alien");
        set.add("java");
        set.add("javaScript");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search: from " + from + " to " + to);
        System.out.println("result1:" + set.subSet(from, to));
        System.out.println("result2:" + set.subSet(from, to + "zzz"));
    }

}
