abstract class Creature{
	private int x;
	private int y;
	private int age;
	
	public Creature(int x, int y, int age) {
		this.x=x;
		this.y=y;
		this.age=age;
	}
	
	public void age() {
		age++;
	}
	
	public void move(int xDistance) {
		x+=xDistance;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public abstract void attack();
	public abstract void printInfo();
	
	public String toString() {
		return "x: "+x+", y: "+y+", age: "+age;
	}
}

abstract class Animal extends Creature{
	public Animal(int x, int y, int age) {
		super(x, y, age);
	}
	
	public void attack() {
		System.out.println("몸을 사용하여 공격");
	}
	
}

abstract class Human extends Creature implements Talkable{
	public Human(int x, int y, int age) {
		super(x, y, age);
	}
	
	public void attack() {
		System.out.println("도구를 사용");
	}
	
	public void talk() {
		System.out.println("사람은 말을 할 수 있다.");
	}
}

interface Talkable{
	abstract void talk();
}

interface Flyable{
	void fly(int yDistance);
	void flyMove(int xDistance, int yDistance);
}

class Pigeon extends Animal implements Flyable{
	public Pigeon(int x, int y, int age) {
		super(x, y, age);
	}
	
	public void fly(int yDistance) {
		setY(getY()+yDistance);
	}
	
	public void flyMove(int xDistance, int yDistance) {
		setY(getY()+yDistance);
		setX(getX()+xDistance);
	}
	
	public void printInfo() {
		System.out.println("Pigeon->"+toString());
	}
}

interface Swimable{
	void swimDown(int yDistance);
}

class Turtle extends Animal implements Swimable{
	public Turtle(int x, int y, int age) {
		super(x, y, age);
	}
	
	public void swimDown(int yDistance) {
		setY(getY()-yDistance);
	}
	
	public void printInfo() {
		System.out.println("Turtle->"+toString());
	}
}

class Kevin extends Human implements Programmer, Swimable{
	public Kevin(int x, int y, int age) {
		super(x, y, age);
	}
	
	public void coding() {
		System.out.println("Hello World");
	}
	
	public void swimDown(int yDistance) {
		setY(getY()-yDistance);
		if(getY()<-10) {
			System.out.println("너무 깊이 들어가면 죽을 수도 있어");
		}
	}
	
	public void printInfo() {
		System.out.println("Kevin->"+toString());
	}
}

interface Programmer{
	void coding();
}


public class google_oop_abstractClass_Interface_difference_Creature {

	public static void main(String[] args) {
		Pigeon p=new Pigeon(1,2,3);
		p.printInfo();
		p.age();
		p.move(10);
		p.printInfo();
		p.fly(3);
		p.printInfo();
		p.flyMove(10, 20);
		p.printInfo();
		p.attack();
		System.out.println();
		
		Kevin kev=new Kevin(1,4,5);
		kev.printInfo();
		kev.age();
		kev.move(3);
		kev.printInfo();
		kev.attack();
		kev.coding();
		kev.swimDown(30);
		kev.printInfo();
		kev.talk();
		System.out.println();
		
		Turtle t=new Turtle(300, 40, 24);
		t.printInfo();
		t.age();
		t.move(-200);
		t.printInfo();
		t.attack();
		t.swimDown(100);
		t.printInfo();
	}

}
