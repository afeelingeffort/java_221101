interface height{
	public abstract void f_height();
}

interface weight{
	public abstract void f_weight();
}

class Person implements height, weight{
	public void f_height() {
		System.out.println("183cm");
	}
	public void f_weight() {
		System.out.println("78kg");
	}
}

class Animal4 implements height, weight{
	public void f_height() {
		System.out.println("162cm");
	}
	public void f_weight() {
		System.out.println("122kg");
	}
}
public class google_oop_interface_Person {

	public static void main(String[] args) {
		Person p=new Person();
		Animal4 a=new Animal4();
		
		p.f_height();
		p.f_weight();
		
		a.f_height();
		a.f_weight();
	}

}
