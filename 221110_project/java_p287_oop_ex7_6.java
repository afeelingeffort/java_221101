class Outer{	// 내부클래스는 객체생성없이 호출이 된다는데 어떻게 하는지 물어보기
	class Inner{
		int iv=100;
	}
}
public class java_p287_oop_ex7_6 {

	public static void main(String[] args) {
		Outer.Inner oi=new Outer().new Inner();
		System.out.println(oi.iv);
	
	}

}
