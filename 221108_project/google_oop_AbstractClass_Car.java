import java.util.ArrayList;

abstract class Carr{
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		System.out.println("==============");
	}
}

class Sonata extends Carr{
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}
	
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}
	
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
}

class Genesis extends Carr{
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}
	
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}
	
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
}

class Avante extends Carr{
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}
	
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}
	
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}
	
	public void turnoff() {
		System.out.println("Sonata 시동을 끕니다.");
	}
}
public class google_oop_AbstractClass_Car {

	public static void main(String[] args) {
		ArrayList<Carr> carList=new ArrayList<Carr>();
		
		carList.add(new Sonata());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Carr car: carList) {
			car.run();
		}
	}

}
