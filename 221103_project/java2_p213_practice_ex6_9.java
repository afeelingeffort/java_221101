class Marine{
	int x=0, y=0; 
	int hp=60;
	int weapon=6;	//static
	int armor=0; 	//static
	
	void weaponUp() {	//static변수에 대한 작업을 하는 메서드라 static붙여야 함. 
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class java2_p213_practice_ex6_9 {

	public static void main(String[] args) {
		Marine m=new Marine();
		
	}

}
