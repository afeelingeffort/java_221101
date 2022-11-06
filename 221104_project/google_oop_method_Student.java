class Student {
	public String studentName;
	public int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}

	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}

class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
}

class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money = money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

class Taxi {
	int taxiNumber;
	int passengerCount;
	int money;

	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(taxiNumber + "의 승객은 " + passengerCount + "명이고, 수입은" + money + "원이다.");
	}
}

public class google_oop_method_Student {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTom = new Student("Tom", 10000);
		Student studentEdward = new Student("Edward", 20000);

		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.showInfo();
		bus100.showInfo();

		Subway subwayGreen = new Subway("2호선");
		studentTom.takeSubway(subwayGreen);
		studentTom.showInfo();
		subwayGreen.showInfo();

		Taxi taxi4534 = new Taxi(4534);
		studentEdward.takeTaxi(taxi4534);
		studentEdward.showInfo();
		taxi4534.showInfo();

	}

}
