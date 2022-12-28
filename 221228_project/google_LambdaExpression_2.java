
interface Calculate{
	public int method(int a, int b);
}

public class google_LambdaExpression_2 {
	static int calc(Calculate c, int x, int y) {
		return c.method(x, y);
	}
	public static void main(String[] args) {
		Calculate c = (a, b) -> a+b; 
		int result1 = calc(c, 5, 10); 
        
		int result2 = calc((a, b) -> a+b, 5, 10);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}