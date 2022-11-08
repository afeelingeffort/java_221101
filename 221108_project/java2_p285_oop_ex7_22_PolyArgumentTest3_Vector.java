import java.util.Vector;

class Tv3 extends Product {
	Tv3() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer3 extends Product {
	Computer3() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio3 extends Product {
	Audio3() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();	//실행이 안되는 이유? 

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		} else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		if (item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}

		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "만원입니다.");
	}
}

public class java2_p285_oop_ex7_22_PolyArgumentTest3_Vector {

	public static void main(String[] args) {
		Buyer3 b=new Buyer3();
		Tv3 tv=new Tv3();
		Computer3 com=new Computer3();
		Audio3 audio=new Audio3();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
