import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class google_FrameWork_Iterator_1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");

        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        Iterator<String> iterList = list.iterator();
        Iterator<String> iterSet = set.iterator();
        /*
         * <String, String>이라고 안 적어도 되구나. 적으면 중복정의라고 오류뜸.
         * Map은 Collection클래스의 상속을 받지 않으니까 매개를 해줄 keySet(), entrySet(), values()를 먼저
         * 호출해야 함.
         */
        Iterator<String> iterMap = map.keySet().iterator();

        System.out.println(iterList.next());
        iterList.remove();
        System.out.println("Remove 테스트용");

        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

}
