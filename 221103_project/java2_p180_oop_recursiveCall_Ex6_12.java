class FactorialTest {

	static long factorial(int n) {
		long result = 0;

		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1);
		}
		return result;
	}
}

public class java2_p180_oop_recursiveCall_ex6_12 {

	public static void main(String[] args) {
		System.out.println(FactorialTest.factorial(4));
	}

}
