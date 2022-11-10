class Sample{
	public void shouldBeRun() {
		System.out.println("ok thanks");
	}
	
}
public class google_exception_trycatch_Sample {

	public static void main(String[] args) {
		Sample s=new Sample();
		int c;
		try {
			c=4/0;
//			s.shoudBeRun();		//에러 남.
		} catch(ArithmeticException e) {
			c=-1;
		} finally {
			s.shouldBeRun();	//예외에 상관없이 무조건 수행된다.
		}
	}

}
