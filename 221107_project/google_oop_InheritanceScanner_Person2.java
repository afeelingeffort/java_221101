import java.util.Scanner;

class Person2{
	int age;
	public String name;
	protected int cm;
	private int kg;
	
	void setKg(int k) {
		kg=k;
	}
	
	int getKg() {
		return kg;
	}
	
}

class Student3 extends Person2{
	
	void printKg(int c, int k) {
		int weight=(int)((c-100)*0.9);
		if(weight<60) {
			System.out.println("저체중");
		} else if(weight>=60 && weight <=80) {
			System.out.println("정상체중");
		} else {
			System.out.println("과체중");
		}
	}
}
public class google_oop_InheritanceScanner_Person2 {

	public static void main(String[] args) {
		Student3 std3=new Student3();
		Scanner scn=new Scanner(System.in);
		
		System.out.println("나이 입력: ");
		std3.age=scn.nextInt();
		System.out.println("이름 입력: ");
		std3.name=scn.next();
		System.out.println("키 입력: ");
		std3.cm=scn.nextInt();
		System.out.println("몸무게 입력: ");
		std3.kg=scn.nextInt();		//
		
		std3.printKg(std3.cm, std3.getKg());
	}

}
