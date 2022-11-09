abstract class Vehicle{
	String name;
	
	public String getName() {
		return "Vehicle name: "+name;
	}
	
}

class Car extends Vehicle{
	public Car(String val) {
		name=val;
	}
	
	public String getName(String val) {
		return "Car name: "+val;
	}
}
public class google_oop_abstractClass_Vehicle {

	public static void main(String[] args) {
		Vehicle v=new Car("dfawfse");
		System.out.println(v.getName());
		
		Car c=new Car("fdsrf");
		System.out.println(c.getName("GENESIS"));
	}

}
