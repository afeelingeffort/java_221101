import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class google_Stream_Iterator_1 {

    public static void main(String[] args) {
        /*
         * ArrayList<String> list=new ArrayList<String>(Arrays.asList("a", "b", "c"));
         * Iterator<String> it=new list.iterator();
         * 
         * while(it.hasNext()) {
         * String value=it.next();
         * 
         * if(StringUtils.equals(value, "b")) {
         * System.out.println("값: "+value);
         * }
         * }
         */

        // 를 foreach구문으로 간단히
        /*
         * ArrayList<String> list=new ArrayList<String>(Arrays.asList("a","b","c"));
         * 
         * for(String value : list) {
         * if(StringUtils.equals(value, "b")) {
         * System.out.println("값: "+value);
         * }
         * }
         */

        // 를 스트림으로 간단히
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
        list.stream().filter("b"::equals).forEach(System.out::println);
    }

}
