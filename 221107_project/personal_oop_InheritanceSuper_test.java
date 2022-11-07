class Parent {
	int a = 1;
}

class Child extends Parent {
	int a = 2;
	
	public String toString() {
		return "this: "+this.a+", super: "+super.a;
	}
	
	void display() {
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

public class personal_oop_InheritanceSuper_test {

	public static void main(String[] args) {
		Child ch = new Child();

		ch.display();
		
		System.out.println(ch);
	}

}
