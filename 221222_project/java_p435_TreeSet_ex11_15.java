import java.util.*;

public class java_p435_TreeSet_ex11_15 {

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = { 80, 75, 95, 35, 40, 100, 10, 65 };

        for (int i = 0; i < score.length; i++) {
            set.add(new Integer(score[i]));
        }

        System.out.println("50보다 작은 값:" + set.headSet(new Integer(50)));
        System.out.println("50보다 큰 값:" + set.tailSet(new Integer(50)));
    }

}
