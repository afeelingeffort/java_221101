interface Phone2{
	int version=12;
	
	String getManufacturer();
	String getOS();
	
	default void printRing() {
		System.out.println("Sound: ring ring");
	}
}

interface Watch{
	String getAppearance();
}

interface Device extends Phone, Watch{
	
}

class Machine implements Device{
	public String getManufacturer() {
		return null;
	}
	
	public String getOS() {
		return null;
	}
	
	public String getAppearance() {
		return null;
	}
}

class Galaxy2 implements Phone2{
	public String getManufacturer() {
		return "Samsung";
	}
	
	public String getOS() {
		return "Android";
	}
	
	public void printRing() {
		System.out.println("Sound: ring");
	}
}
public class google_oop_interface_Phone2 {

	public static void main(String[] args) {
		Phone2 galaxy=new Galaxy2();
		System.out.println(galaxy.getManufacturer());
		System.out.println(galaxy.getOS());
		galaxy.printRing();
	}

}
