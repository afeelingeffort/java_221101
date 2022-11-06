class OverloadConstructorPerson{
	String name="홍길동";
	int age=20;
	boolean b=false;
	
	OverloadConstructorPerson(String name, int age, boolean b){
		this.name=name;
		this.age=age;
		this.b=b;
	}
	
	OverloadConstructorPerson(String name, int age){
		this(name, age, false);
	}
	
	OverloadConstructorPerson(String name){
		this(name, 0, false);
	}
	
	OverloadConstructorPerson(){}
}

public class google_oop_this_1 {

	public static void main(String[] args) {
		OverloadConstructorPerson p1=new OverloadConstructorPerson("하이", 44);
		System.out.printf("이름: %s, 나이: %d%n",p1.name, p1.age);
		
		OverloadConstructorPerson p2= new OverloadConstructorPerson();
		System.out.printf("이름 : %s, 나이: %d%n", p2.name, p2.age);
	}

}
