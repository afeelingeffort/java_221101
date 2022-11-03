class PlayingCard{
	int kind;
	int num;	//인스턴스 변수
	
	static int width;
	static int height;	//클래스변수(static변수)
	
	PlayingCard(int k, int n){
		kind=k;
		num=n;	//k와 n은 지역변수
	}
	
	
}
public class java2_p212_practice_ex6_8 {

	public static void main(String[] args) {
		PlayingCard card=new PlayingCard(1, 1);
	}

}
