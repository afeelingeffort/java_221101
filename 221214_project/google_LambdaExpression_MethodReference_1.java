import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class google_LambdaExpression_MethodReference_1 {

	public static void main(String[] args) {
		DoubleUnaryOperator oper;
		
		oper=(n)->Math.abs(n);	//람다 표현식
		System.out.println(oper.applyAsDouble(-5));
		
		oper=Math::abs;	//메소드 참조
		System.out.println(oper.applyAsDouble(-5));
		
		
		System.out.println();
		Consumer<Integer> c=System.out::println;
		c.accept(1);
		
		Function<Double, Double> f=Math::sqrt;
		System.out.println(f.apply(25.0));
	}

}
