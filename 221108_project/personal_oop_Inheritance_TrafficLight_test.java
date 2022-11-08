// 다시 설계부터 다시하기 
abstract class TrafficLight{
	String person;
	String car;
	boolean redLight;
	boolean greenLight;
	boolean orangeLight;
	
	public TrafficLight() {}
	
	public TrafficLight(boolean redLight, boolean greenLight, boolean orangeLight) {
		this.redLight=redLight;
		this.greenLight=greenLight;
		this.orangeLight=orangeLight;
	}
	
	public abstract void changeLight();
}

class pedestrian_signal extends TrafficLight{
	boolean Light;
	
	public pedestrian_signal(boolean redLight, boolean greenLight, boolean orangeLight) {
		super(redLight, greenLight, orangeLight);
	}
}
public class personal_oop_Inheritance_TrafficLight_test {

	public static void main(String[] args) {

	}

}
