abstract class Car2{
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}	//추상메서드가 아니라 구현된 메서드인데 구현내용이 없는 것. 필요한 경우 재정의 하여 사용.
	
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}

class AICar extends Car2{
	
	public void drive() {
		System.out.println("자율 주행을 합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}
	
	public void stop() {
		System.out.println("장애물 앞에서 스스로 멈춥니다.");
	}
	
	public void wiper() {}
	
	public void washCar() {
		System.out.println("자동 세차를 합니다.");
	}
}

class ManualCar extends Car2{
	
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");
	}
	
	public void stop() {
		System.out.println("장애물 앞에서 브레이크를 밟아 정지합니다.");
	}
	
	public void wiper() {}
}
public class google_oop_abstractClass_Car2 {

	public static void main(String[] args) {
		Car2 c2=new AICar();
		c2.run();
		
		System.out.println("==========================");
		
		Car2 cc2=new ManualCar();
		cc2.run();
		
	}

}
