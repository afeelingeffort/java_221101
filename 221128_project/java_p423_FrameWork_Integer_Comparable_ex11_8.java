import java.util.Arrays;
import java.util.Comparator;

public class java_p423_FrameWork_Integer_Comparable_ex11_8 {

    public static void main(String[] args) {
        Integer[] arr = { 30, 40, 50, 10, 20 };

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new DescComp());
        System.out.println(Arrays.toString(arr));
    }

}

class DescComp implements Comparator {
    public int compare(Object o1, Object o2) {
        if (!(o1 instanceof Integer && o2 instanceof Integer))
            return -1;

        Integer i = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2 - i;
    }
}