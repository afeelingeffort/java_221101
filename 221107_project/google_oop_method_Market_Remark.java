class Buyer {
	private int productNum;
	private int money;

	public Buyer(int productNum, int money) {	//구매자 생ㅅ
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

	public void buy(Seller seller) {	// 1. 구매자가 buy하면 매개변수 seller로 Seller에 있는 sell() 메서드를 호출한다. 
		seller.sell(this);		

		this.productNum++;
	}

	public void pay(int money) {	//3. 그러면 Buyer의 money는 구매한 물건 값만큼 -money가 된다.  
		this.money -= money;
	}

	public String toString() {
		String msg = String.format("구매한 상품 갯수: %d\n구매자가 가진 금액: %d\n", this.productNum, this.money);

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

	public void sell(Buyer buyer) {		// 2. sell()메서드가 호출되면 Seller는 productNum--가 되고 매개변수 Buyer클래스의 buyer가 pay를 호출해서 Buyer의 pay()메서드로 이동한다. 
		this.productNum--;

		buyer.pay(PRICE);

		this.money += PRICE;
	}

	public boolean isSoldOut() {	// 판매자 Seller의 productNum(재고수)가 0이면 isSoldOut을 반환한다. 
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

		minjung.buy(mj);	// minjung(Buyer)가 buy()메서드로 mj(Seller)를 호출한다. 

		System.out.println(minjung);
		System.out.println(mj);
	}
}

public class google_oop_method_Market_Remark {

	public static void main(String[] args) {
		new Market().start();	//Marcket 클래스의 start메서드를 호출한다. 
	}

}
