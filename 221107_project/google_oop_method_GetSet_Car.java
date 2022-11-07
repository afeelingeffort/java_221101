class Car2{
	private int fuel=0;
	
	void set(int input1) {
		if(input1<10) {
			System.out.println("input1 value less than 10");
		} else {
			fuel=input1;
		}
	}
	
	int get() {
		return fuel;
	}
}
public class google_oop_method_GetSet_Car {

	public static void main(String[] args) {
		Car2 c=new Car2();
		
//		c.set(13);
//		System.out.println(c.get());
//		
//		c.set(8);
//		System.out.println(c.get());
		
		c.set(8);
		System.out.println(c.get());	//0은 어디서 생겨났지 

		c.set(13);
		System.out.println(c.get());
	}

}
