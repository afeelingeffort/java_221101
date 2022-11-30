import java.util.List;

class Calcu {
    public void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
    }

    public int sum(List<? extends Number> list) {
        int sum = 0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public List<? super Integer> addList(List<? super Integer> list) {
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        return list;
    }
}

public class google_Generics_WildCard {

    public static void main(String[] args) {

    }

}
