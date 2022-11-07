import java.util.Scanner;

class Drink {
	private String name;
	private int price;

	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class DrinkMain {
	Scanner scn = new Scanner(System.in);

	Drink[] arr = new Drink[5];

	public void inputData() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("음료 이름>");
			String name = scn.nextLine();

			System.out.println("가격 입력>");
			int price = scn.nextInt();
			scn.nextLine();
			arr[i] = new Drink(name, price);
		}
		System.out.println();
	}
	
	public void viewData() {
		int sum=0;
		System.out.println("음료 리스트");
		for(Drink d: arr) {
			System.out.println("음료 이름: "+d.getName()+", 가격: "+d.getPrice());
			sum+=d.getPrice();
		}
		System.out.println("총 금액: "+sum);
	}
	
	
}

public class google_oop_InheritanceArray_Drink {

	public static void main(String[] args) {
		DrinkMain dm=new DrinkMain();
		dm.inputData();
		dm.viewData();
	}

}
