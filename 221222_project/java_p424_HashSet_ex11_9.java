import java.util.*;

public class java_p424_HashSet_ex11_9 {

       public static void main(String[] args) {
              Object[]  obj Arr = { "1", new Integer( 1),  "2",  "2" , "3 ", " 3",  "4", "4", "4" };
              S e t set = new HashSet();

               for   (int   i = 0; i < objArr.length; i++) {
                     set.add(objArr[i]);
              }

              System.out.println(set);

              Itera t or it = set.iterator();

               while (it.hasNext())
                     System.out.println(it.next());
       }

}
