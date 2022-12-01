
import java.util.ArrayList;

public class java_Generics_1 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        // ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add("30");

        // Integer i=list.get(2);
        Integer i = (Integer) list.get(2); // 컴파일OK.(컴파일러의 한계) 근데 형변환 에러 발생함. 이럴 때, 지네릭스 사용!

        System.out.println(list);
    }

}
