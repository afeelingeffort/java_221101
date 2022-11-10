
class Outer2{	//내부클래스 물어보기
	int value=10;
	
	class Inner2{
		int value=20;
		
		void method1() {
			int value=30;
			
			System.out.println(value);
			System.out.println();
			System.out.println(this.value);
			System.out.println(Outer2.this.value);
		}
	}
}
public class java_p288_oop_ex7_8 {

	public static void main(String[] args) {
		Outer2.Inner2 inner=new Outer2().new Inner2();
		
		inner.method1();
	}

}
