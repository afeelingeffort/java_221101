class Buyer {
	private int productNum;
	private int money;

	public Buyer(int productNum, int money) {
		System.out.println("구매자 생성자 호출");
		setProductNum(productNum);
		setMoney(money);

		System.out.println(this);
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int getProductNum() {
		return this.productNum;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return this.money;
	}

	public void buy(Seller seller) {	// 참조형 매개변수 (?)
		seller.sell(this);		// 이 코드 해석을 모르겠다.

		this.productNum++;
	}

	public void pay(int money) {
		this.money -= money;
	}

	public String toString() {
		String msg = String.format("구매한 상품 갯수: %d\n 구매자가 가진 금액: %d\n", this.productNum, this.money);

		return msg;
	}

}

class Seller {
	private final int PRICE = 2500;
	private int money;
	private int productNum;

	public Seller(int productNum, int money) {
		System.out.println("판매자 생성자 호출");

		setProductNum(productNum);
		setMoney(money);

		System.out.println(this);
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public int getProductNum() {
		return this.productNum;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void sell(Buyer buyer) {
		this.productNum--;

		buyer.pay(PRICE);

		this.money += PRICE;
	}

	public boolean isSoldOut() {
		boolean isSoldOut = this.productNum == 0;

		return isSoldOut;
	}

	public String toString() {

		String msg = String.format("판매자의 상품 갯수: %d\n판매자가 가진 금액: %d", this.productNum, this.money);
		return msg;
	}

}

class Market {
	public void start() {

		Buyer minjung = new Buyer(0, 50000);
		Seller mj = new Seller(500, 50000);

		minjung.buy(mj);

		System.out.println(minjung);
		System.out.println(mj);
	}
}

public class google_oop_method_Market {

	public static void main(String[] args) {
		new Market().start();
	}

}
