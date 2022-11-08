class Car {
}

class FireEngine extends Car {
}

public class java2_p274_oop_ex7_16_InstanceOfTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine();

		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		if (fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		if (fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
	}

}
