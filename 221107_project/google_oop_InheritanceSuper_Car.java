class Car{
	String name;
	String createName;
	
	String getName() {
		return name;
	}
	
	String getCreatName() {
		return createName;
	}
	
}

class Sonata extends Car{
	String getName(int num) {
		if(num>5) {
			return super.getName(num);
		}else {
			return "나는 자식이다."+name;
		}
	}
}
public class google_oop_InheritanceSuper_Car {

	public static void main(String[] args) {
		Sonata sona1=new Sonata();
		sona1.name="소나타";
		System.out.println(sona1.getName());
		
		
	}

}
