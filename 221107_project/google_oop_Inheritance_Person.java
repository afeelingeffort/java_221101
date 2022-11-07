class Person{
	protected String name;
	protected int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String toString() {
		return "Person [name="+name+", age="+age+"]";
	}
	
	
}

class Student2 extends Person{
	
	public Student2(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	public String toString() {
		return "Student [name="+name+", age="+age+"]";
	}
}

public class google_oop_Inheritance_Person {

	public static void main(String[] args) {
		Student2 std=new Student2("홍길동", 30);
		System.out.println(std);
	}

}
