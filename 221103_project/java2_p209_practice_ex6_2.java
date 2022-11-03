
public class java2_p209_practice_ex6_2 {

	public static void main(String[] args) {
		SutdaCard card1=new SutdaCard(3, false);
		SutdaCard card2=new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard{
	int num;
	boolean b;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean b){
		this.num=num;
		this.b=b;
	}
	
	String info() {
		return 
	}
}