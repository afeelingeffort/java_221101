interface OpenCloseIf{
	public void open();
	public void close();
}

interface PaintIf{
	public void Red();
	public void Blue();
}

class Door implements OpenCloseIf, PaintIf{
	public void open() {
		System.out.println("Door Open");
	}
	
	public void close() {
		System.out.println("Door Close");
	}
	
	public void Red() {
		System.out.println("Paint the door red");
	}
	
	public void Blue() {
		System.out.println("Paint the door blue");
	}
}

class Bottle implements OpenCloseIf{
	public void open() {
		System.out.println("Bottle Open");
	}
	
	public void close() {
		System.out.println("Botlle Close");
	}
}
public class google_oop_interface_Door {

	public static void main(String[] args) {
		
	}

}
