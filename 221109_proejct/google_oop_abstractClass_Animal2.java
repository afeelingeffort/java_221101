abstract class Animal2{
	public int leg;
	public void run() {
		System.out.println("달린다");
	}
	
	abstract public void eat();
}

class Dog extends Animal2{
	public void eat() {
		System.out.println("냠냠");
	}
}

public class google_oop_abstractClass_Animal2 {

	public static void main(String[] args) {
		Dog d=new Dog();
		
		d.eat();
		d.leg=4;
		d.run();
	}

}
