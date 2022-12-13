import java.util.function.Function;

public class google_LambdaExpression_MethodReference_Array {

    public static void main(String[] args) {
        Function<Integer, int[]> f = (i) -> new int[i];

        int[] arr = f.apply(100);
        System.out.println("aar.length=" + arr.length);

        // 위 문장들을 간단히 하면
        Function<Integer, int[]> f2 = int[]::new;

        System.out.println(f2.apply(100).length);
    }

}
