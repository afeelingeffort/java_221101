
// 낯설고 어렵다. 
import java.util.function.Function;

public class google_LambdaExpression_MethodReference {

    public static void main(String[] args) {
        // Function<String, Integer> f=(String s)->Integer.parseInt(s); //람다식
        // Function<String, Integer> f=클래스이름::메서드이름; //메서드 참조
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("100") + 200);
    }

}
