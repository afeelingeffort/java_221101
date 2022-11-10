class SutdaDeck2{		// 주석 달기
	final int CARD_NUM=20;
	SutdaCard[] cards=new SutdaCard[CARD_NUM];
	
	SutdaDeck2() {
		for(int i=0; i<CARD_NUM; i++) {
			if(i==0||i==2||i==7) {
				cards[i]=new SutdaCard(i+1, true);
			} else {
				cards[i]=new SutdaCard(i%10+1, false);
			}
		}
	}
	
	public void shuffle() {
		for(int i=0; i<CARD_NUM; i++) {
			int j=(int)(Math.random()*(CARD_NUM));
			
			SutdaCard tmp=cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
		}
	}
	
	public SutdaCard pick(int i) {
		return cards[i];
	}
	
	public SutdaCard pick() {
		int i=(int)(Math.random()*(CARD_NUM/2));
		
		return cards[i];
	}
}

class SutdaCard2{
	int num;
	boolean isKwang;
	
	SutdaCard2(){
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public String toString() {
		return num+(isKwang?"K":"");
	}
}
public class java_p282_oop_ex7_2 {

	public static void main(String[] args) {
		SutdaDeck2 deck=new SutdaDeck2();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+", ");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
