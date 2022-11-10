interface Animal{
	public static final String name="동물";
	
	public abstract void move();
//	public abstract void eat();
	public abstract void bark();
}

class Dog implements Animal{
	public void move() {
		System.out.println("슥슥");
	}
	
	public void bark() {
		System.out.println("멍멍");
	}
}

class Cat implements Animal{
	public void move() {
		System.out.println("사뿐사뿐");
	}
	
	public void bark() {
		System.out.println("야옹");
	}
}
public class google_oop_interface_Animal {

	public static void main(String[] args) {
		Dog d=new Dog();
		Cat c=new Cat();
		
		d.move();
		d.bark();
		
		c.move();
		c.bark();
	}

}
