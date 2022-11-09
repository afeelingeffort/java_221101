abstract class Animal3 {
	String animal_name;

	Animal3(String name) {
		animal_name = name;
	}

	public abstract void cry();

	public abstract void behavior();
}

class Tiger extends Animal3 {
	public Tiger(String name) {
		super(name);
	}

	public void cry() {
		System.out.println("어흥");
	}

	public void behavior() {
		System.out.println("우측으로 빠르게 움직인다.");
	}
}

class Dog3 extends Animal3 {
	public Dog3(String name) {
		super(name);
	}

	public void cry() {
		System.out.println("멍멍");
	}

	public void behavior() {
		System.out.println("왼쪽으로 느리게 달린다.");
	}
}

public class google_oop_abstractClass_Animal3 {

	public static void main(String[] args) {
		Tiger t = new Tiger("호돌");
		System.out.println("사자의 이름은: " + t.animal_name);

	}

}
