import java.util.TreeSet;

public class google_FrameWork_SubSet_1 {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        String[] name = { "apple", "apple1", "banana", "pineapple" };
        for (String str : name) {
            set.add(str);
        }

        System.out.println("Search : a ~ p ");
        System.out.println(set.subSet("a", "p"));
        System.out.println("Search : a ~ pzzzz");
        System.out.println(set.subSet("a", "pzzzz"));

        /*
         * TreeSet<Integer> set2=new TreeSet<>();
         * int[] num= {3, 43, 15, 72, 65, 24 ,78 ,4, 23 ,12, 43, 64, 12};
         * for(int i: num) {
         * set.add(i);
         * }
         * 
         * System.out.println("30보다 큰 값: "+set.tailSet(30));
         * System.out.println("30보다 작은 값: "+set.headSet(30));
         */
    }

}
