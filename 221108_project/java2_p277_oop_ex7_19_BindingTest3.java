class Parent3{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3{
	int x=200;
	
	void method() {
		System.out.println("x="+x);
		System.out.println("super.x="+super.x);
		System.out.println("this.x="+this.x);
	}
}
public class java2_p277_oop_ex7_19_BindingTest3 {

	public static void main(String[] args) {
		Parent3 p3=new Child3();
		Child3 c3=new Child3();
		
		System.out.println("p3.x="+p3.x);
		p3.method();
		System.out.println();
		System.out.println("c3.x="+c3.x);
		c3.method();
	}

}
