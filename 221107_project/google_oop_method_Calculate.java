import java.util.Scanner;

class Calculate {

	static int plus(int a, int b) {
		return a + b;
	}

	static int minus(int a, int b) {
		return a - b;
	}

	static int gob(int a, int b) {
		return a * b;
	}

	static void div(int a, int b) {
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.printf("%d / %d= %2f\n", a, b, a / (double) b);
		}
	}

}

public class google_oop_method_Calculate {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정수 입력(5 2): ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.print("연산자 입력(+, -, *, /) : ");
		String op = scn.next();
		int result = 0;

		switch (op) {
		case "+":
			result = Calculate.plus(a, b); // static메서드는 객체생성 없이 호출 되는데 왜 안되지?
			System.out.printf("%d + %d = %d%n", a, b, result);
			break;

		case "-":
			result = Calculate.minus(a, b);
			System.out.printf("%d - %d = %d%n", a, b, result);
			break;

		case "*":
			result = Calculate.gob(a, b);
			System.out.printf("%d * %d =  %d%n", a, b, result);
			break;

		case "/":
			Calculate.div(a, b);
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
		}
	}

}
