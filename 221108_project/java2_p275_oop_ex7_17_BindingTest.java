class Parent2{
	int x=100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent2{
	int x=200;
	
	void method() {
		System.out.println("Child Method");
	}
}
public class java2_p275_oop_ex7_17_BindingTest {

	public static void main(String[] args) {
		Parent2 p=new Child2();
		Child2 c=new Child2();
		
		System.out.println("p.x="+p.x);
		p.method();
		
		System.out.println("c.x="+c.x);
		c.method();
	}

}
