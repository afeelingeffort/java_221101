interface WashingMachine{
	public void startButtonPressed();
	public void pauseButtonPressed();
	public void stopButtonPressed();
	public int changeSpeed(int speed);
}

interface dryCouse{
	public void dry();
}

class LGWashingMachine implements WashingMachine{
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작하였습니다.");
	}
	
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 중지하였습니다.");
	}
	
	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 일시중지하였습니다.");
	}
	
	public int changeSpeed(int speed) {
		int rtnSpeed=0;
		
		switch(speed) {
		case 1:
			rtnSpeed=20;
			break;
			
		case 2:
			rtnSpeed=50;
			break;
			
		case 3:
			rtnSpeed=100;
			break;
		}
		
		return rtnSpeed;
	}
	
	public void dry() {
		System.out.println("세탁이 완료되어 건조하기 시작하였습니다.");
	}
}
public class google_oop_Interface_WashingMachine {

	public static void main(String[] args) {
		LGWashingMachine wm=new LGWashingMachine();
		wm.startButtonPressed();
		System.out.println("세탁기의 속도는 "+wm.changeSpeed(3)+" 입니다.");
	}

}
