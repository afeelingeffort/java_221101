import java.io.IOException;

public class google_Exception_re_throwing_trycatch_1 {
	public static void exceptionRethrowing() throws Exception{
		try {
			System.out.println("4");
			throw new IOException("ExceptionRethrowing");
		} catch(IOException e) {
			System.out.println("5");
			e.printStackTrace();
			throw new Exception("re-throwing");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("1");
			exceptionRethrowing();
			System.out.println("2");
		} catch(Exception e) {
			System.out.println("3");
			e.printStackTrace();
			System.out.println("end");
		}
	}
	

}
