class ReturnTest {

	int add(int a, int b) {
		return a + b;
	}

	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}

}

public class java2_p170_oop_ex6_5 {

	public static void main(String[] args) {
		ReturnTest r = new ReturnTest();

		int result = r.add(3, 5);
		System.out.println(result);

		int[] result2 = { 0 };
		r.add(3, 5, result2);
		System.out.println(result2[0]);
	}

}
