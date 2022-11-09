abstract class Employee{
	private String name;
	private String address;
	private int number;
	
	public Employee(String name, String address, int number) {
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public double computePay() {
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println(this.name+" "+this.address);
	}
	
	public String toString() {
		return name+" "+address+" "+number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String newAddress) {
		address=newAddress;
	}
	
	public int getNumber() {
		return number;
	}
}

class Salary extends Employee{
	private double salary;
	
	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		this.salary=salary;
	}
	
	public void mailCheck() {
		System.out.println(getName()+" 봉급 : "+salary);
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
	}
	
	public double computePay() {
		System.out.println("계산된 급여: "+getName());
		return salary/52;
	}
}
public class google_oop_abstractClass_Employee {

	public static void main(String[] args) {
		Salary s=new Salary("홍길동", "대전", 23, 3600.00);
		Employee e=new Salary("고길동", "부산", 25, 2400.00);
		System.out.println("Salary 참조-------------");
		s.mailCheck();
		System.out.println("\nEmployee 참조------------ ");
		e.mailCheck();
	}

}
