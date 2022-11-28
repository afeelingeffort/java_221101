import java.util.ArrayList;
import java.util.Arrays;

public class google_FrameWork_ArrayList_declaration {

    public static void main(String[] args) {
        ArrayList<Integer> int1 = new ArrayList<Integer>();
        ArrayList<Integer> int2 = new ArrayList<>();
        // ArrayList int3=new ArrayList<>();
        ArrayList<Integer> int4 = new ArrayList<>(10);
        // ArrayList int5=new ArrayList(10);
        ArrayList<Integer> int6 = new ArrayList<>(int1); // 다른 Collection값으로 초기화
        ArrayList<Integer> int7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // Arrays.asList()로 초기화

        for (Integer i : int7)
            System.out.println(i + " ");
    }

}
