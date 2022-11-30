import java.util.ArrayList;

public class google_Generics_reasonToUse {

    public static void main(String[] args) {

        // 제네릭을 사용하지 않은 경우 타입변환이 필요함.
        ArrayList list = new ArrayList();
        list.add("hello world");
        String tmp = (String) list.get(0);

        // 제네릭을 사용한 경우 타입변환이 필요하지 않음.
        ArrayList<String> list2 = new ArrayList();
        list2.add("hello world");
        String tmp2 = list2.get(0);
    }

}
