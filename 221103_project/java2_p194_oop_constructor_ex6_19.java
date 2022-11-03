class Car{
	String color;
	String gearType;
	int door;
	
	Car(){}
	
	Car(String c, String g, int d){
		color=c;
		gearType=g;
		door=d;
	}
	
}
public class java2_p194_oop_constructor_ex6_19 {

	public static void main(String[] args) {
		Car c1=new Car();
		
		c1.color="black";
		c1.gearType="auto";
		c1.door=4;
		
		Car c2=new Car("white","auto",4);
		
		System.out.println("c1의 color는"+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color는"+c2.color+", gearType="+c2.gearType+", door="+c2.door);
	}

}
