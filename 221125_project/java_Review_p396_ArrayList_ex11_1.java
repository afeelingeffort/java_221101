import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class java_Review_p396_ArrayList_ex11_1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        System.out.print(list1, list2); // print가 써지지 않음.

        Collections.sort(list1);

    }

}
