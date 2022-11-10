class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0||i==2||i==7) {
				cards[i]=new SutdaCard(i+1, true);
			} else {
				cards[i]=new SutdaCard(i%10+1, false);
			}
		}
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public String toString() {
		return num+(isKwang? "K":"");
	}
	
}
public class java_p281_oop_ex7_1 {

	public static void main(String[] args) {
		SutdaDeck deck=new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+", ");
		}
	}

}
