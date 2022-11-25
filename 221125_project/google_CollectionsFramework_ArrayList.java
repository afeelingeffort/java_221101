
//List : 순서 O, 중복 O ex) ArrayList
import java.util.ArrayList;

public class google_CollectionsFramework_ArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();

        arrList.add("넷");
        arrList.add("둘");
        arrList.add("하나");
        arrList.add("셋");

        for (int i = 0; i < arrList.size(); i++)
            System.out.println(arrList.get(i));
    }

}
