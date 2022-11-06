
public class flowchartTest_p104_loop {

	public static void main(String[] args) {
		int a = 1, b = 1;
		int c;

		System.out.print(a + " " + b + " ");
		for (int i = 0; i < 18; i++) {	//a, b, c는 제외해서 18번째까지만 출력하게 
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}

	}

}
