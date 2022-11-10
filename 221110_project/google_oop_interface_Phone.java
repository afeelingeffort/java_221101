interface Phone{
	int version=12;
	
	String getManufacturer();
	String getOS();
}

class IPhone implements Phone{
	public String getManufacturer() {
		return "Apple";
	}
	
	public String getOS() {
		return "MacOS";
	}
}

class Galaxy implements Phone{
	public String getManufacturer() {
		return "Samsung";
	}
	
	public String getOS() {
		return "Android";
	}
}


public class google_oop_interface_Phone {

	public static void main(String[] args) {
		Phone galaxy=new Galaxy();
		Phone iphone=new IPhone();
		
		System.out.println(galaxy.getManufacturer());
		System.out.println(galaxy.getOS());
		System.out.println(iphone.getManufacturer());
		System.out.println(iphone.getOS());
	}

}
