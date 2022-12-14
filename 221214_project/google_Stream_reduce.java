import java.util.stream.Stream;

public class google_Stream_reduce {

    public static void main(String[] args) {
        Integer[] intArr = { 11, 10, 5, 2 };

        Stream<Integer> st = Stream.of(intArr);

        Integer sum = st.reduce(0, (a, b) -> a + b);
        System.out.println("sum=" + sum);

        Stream<Integer> st2 = Stream.of(intArr);
        Integer max = st2.reduce((Integer.MIN_VALUE), (a, b) -> a > b ? a : b);
        System.out.println("max=" + max);
    }

}
