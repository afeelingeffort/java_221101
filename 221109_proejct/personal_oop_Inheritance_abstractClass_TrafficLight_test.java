// 다시 설계부터 다시하기 
abstract class TrafficLight{
	boolean redLight;
	boolean greenLight;
	boolean orangeLight;
	
	public TrafficLight() {}
	
	public TrafficLight(boolean redLight, boolean greenLight, boolean orangeLight) {
		this.redLight=redLight;
		this.greenLight=greenLight;
		this.orangeLight=orangeLight;
	}
	
//	public abstract void changeLight();
	public void greenLightOn() {
		System.out.println("초록불로 바뀌었습니다.");
	}
	
	public void orangeLightOn() {
		System.out.println("주황불로 바뀌었습니다.");
	}
	
	public void redLightOn() {
		System.out.println("빨간불로 바뀌었습니다.");
	}
	
	public abstract void crossStreet();
	
//	final public void run() {
//		greenLightOn();
//		orangeLightOn();
//		redLightOn();
//	}
}

class pedestrian_signal extends TrafficLight{
	String pedestrian;
	
	public pedestrian_signal(boolean redLight, boolean greenLight, boolean orangeLight, String pedestrian) {
		super(redLight, greenLight, orangeLight);
		this.pedestrian=pedestrian;
	}
	
	public void crossStreet() {
		if(greenLight) {
			System.out.println("보행자가 신호를 건넙니다.");
		} else if(orangeLight) {
			System.out.println("잠시 멈춥니다.");
		} else if(redLight){
			System.out.println("보행자가 신호를 기다립니다.");
		}
	}
}

class vehicle_signal extends TrafficLight{
	String vehicle;
	
	public vehicle_signal(boolean redLight, boolean greenLight, boolean orangeLight, String vehicle) {
		super(redLight, greenLight, orangeLight);
		this.vehicle=vehicle;
	}
	
	public void crossStreet() {
		if(greenLight) {
			System.out.println("차가 신호를 건넙니다.");
		} else if(orangeLight) {
			System.out.println("잠시 멈춥니다.");
		} else if(redLight) {
			System.out.println("차가 신호를 기다립니다.");
		}
	}
	
}

public class personal_oop_Inheritance_abstractClass_TrafficLight_test {

	public static void main(String[] args) {

	}

}
