class Student2{
	private String name;
	private int age;
	private int score;
	
	public Student2(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Student2(String name, int age, int score) {
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	public Student2(Person person) {
		this(person.getName(), person.getAge());
	}
	public Student2(StudentRequest studentRequest) {
		this(studentRequest.getName(), studentRequest.getAge());
	}
	
	public void addAge(int adder) {
		this.age+=adder;
	}
	
	public static Student2 withScore(String name, int age, int score) {
		return new Student2(name, age, score);
	}
}
public class google_oop_constructor_Student2 {

	public static void main(String[] args) {
		Student2 student=new Student2("Sally", 24);
		StudentRequest studentRequest=new StudentRequest("student",23);
		
		Person nick=new Person("nick", 8);
		Student2 personToStudent= new Student2();
	}

}
