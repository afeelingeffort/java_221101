//고의로 예외를 발생시켜 호출스택 내용 확인, main메서드 X
public class java2_p628_ThreadEx2 {

	public static void main(String[] args) {
		MyThreadEx2_1 t1=new MyThreadEx2_1();
		t1.start();
	}

}

class MyThreadEx2_1 extends Thread{
	public void run() {
		throwException();
	}
	
	public void throwException() {
		try {
			throw new Exception();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
