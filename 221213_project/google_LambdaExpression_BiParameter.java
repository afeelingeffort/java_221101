import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class google_LambdaExpression_BiParameter {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biC=(num1, num2)->System.out.println(num1+num2);
		biC.accept(1, 2);
		
		BiFunction<Integer, Integer, Integer> biF=(num1, num2)->num1+num2;
		int result1=biF.apply(1,2);
		System.out.println(result1);
		
		BiPredicate<Integer, Integer> biP=(num1, num2)->num1>num2;
		boolean result2=biP.test(1,2);
		System.out.println(result2);
	}

}
