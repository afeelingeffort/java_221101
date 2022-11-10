// 아니 뭔가 진짜 이상해
abstract class TrafficLight {
	boolean redLight = false;
	boolean greenLight = false;
	boolean orangeLight = false;

	public TrafficLight() {
	}

	public TrafficLight(boolean redLight, boolean greenLight, boolean orangeLight) {
		this.redLight = redLight;
		this.greenLight = greenLight;
		this.orangeLight = orangeLight;
	}

	public abstract void crossStreet();

	public abstract void LightOn();

//	final public void run() {
//		greenLightOn();
//		orangeLightOn();
//		redLightOn();
//	}
}

class pedestrian_signal extends TrafficLight {
	String pedestrian;

	public pedestrian_signal(boolean redLight, boolean greenLight, boolean orangeLight, String pedestrian) {
		super(redLight, greenLight, orangeLight);
		this.pedestrian = pedestrian;
	}

	public void LightOn() {
		if (greenLight == false) {
			System.out.println("초록불로 바뀌었습니다.");
		} else if (orangeLight == false) {
			System.out.println("주황불로 바뀌었습니다.");
		} else if (redLight == false) {
			System.out.println("빨간불로 바뀌었습니다.");
		}
	}

	public void crossStreet() {
		if (redLight) {
			System.out.println(pedestrian + " (이)가 신호를 건넙니다.");
		} else if (orangeLight) {
			System.out.println(pedestrian + " (이)가 잠시 멈춥니다.");
		} else if (greenLight) {
			System.out.println(pedestrian + " (이)가 신호를 기다립니다.");
		}

	}

}

class vehicle_signal extends TrafficLight {
	String vehicle;

	public vehicle_signal(boolean redLight, boolean greenLight, boolean orangeLight, String vehicle) {
		super(redLight, greenLight, orangeLight);
		this.vehicle = vehicle;
	}

	public void LightOn() {
		if (greenLight == true) {
			System.out.println("초록불로 바뀌었습니다.");
		} else if (orangeLight == true) {
			System.out.println("주황불로 바뀌었습니다.");
		} else if (redLight == true) {
			System.out.println("빨간불로 바뀌었습니다.");
		}
	}

	public void crossStreet() {
		if (greenLight) {
			System.out.println(vehicle + " (이)가 신호를 건넙니다.");
		} else if (orangeLight) {
			System.out.println(vehicle + " (이)가 잠시 멈춥니다.");
		} else if (redLight) {
			System.out.println(vehicle + " (이)가 신호를 기다립니다.");
		}

	}

}

public class RePersonal_oop_Inheritance_abstractClass_TrafficLight {

	public static void main(String[] args) {
		TrafficLight ps = new pedestrian_signal(true, false, false, "보행자1");
		TrafficLight vs=new vehicle_signal(true, false, false, "차량1");
		
		ps.LightOn();
		ps.crossStreet();
		vs.LightOn();
		vs.crossStreet();
		
		
		
		
		
	}

}
