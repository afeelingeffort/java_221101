class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
}

class Tv extends Product{	// Product 생성자가 없어서 에러가 난다.
	Tv(){}
	
	
	public String toString() {
		return "Tv";
	}
}
public class java_p284_oop_ex7_3 {

	public static void main(String[] args) {
		Tv t=new Tv();
	}

}
