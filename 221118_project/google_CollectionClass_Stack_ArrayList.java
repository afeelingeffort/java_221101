import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class google_CollectionClass_Stack_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < 10; i++)
            list.add(i);
        for (int i = 0; i < 10; i++)
            st.push(i);

        System.out.println("st max()" + Collections.max(st));
        System.out.println("list min()" + Collections.min(list));

        Collections.sort(st);
        Collections.reverse(st);
        Collections.sort(st, Collections.reverseOrder()); // 내림차순
        System.out.print("\n역순 출력: ");

        for (int i : st)
            System.out.print(i + " ");
        System.out.println("\n");

        Collections.shuffle(st);
        System.out.print("\n랜덤 출력");
        for (int i : st)
            System.out.print(i + " ");
        System.out.println("\n");

        Collections.sort(st);
        System.out.print("정방향 정렬: ");
        for (int i : st)
            System.out.print(i + " ");
        System.out.println("\n\n이진탐색 5값의 위치: " + Collections.binarySearch(st, 5));

        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(98, 99));
        System.out.println("\ndisjoint (완전히 다른가?) : " + Collections.disjoint(list, list2));

    }

}
