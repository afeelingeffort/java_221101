final class Singleton{
	private static Singleton s=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
}
public class java2_p263_oop_ex7_13_SigletonTest {

	public static void main(String[] args) {
//		Singleton s=new Singleton();	//접근제어자 private 때문에 접근 불가.
//		Singleton s1=new Singleton.getInstance();
	}

}
