interface Remotecontrol{
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}

class Audio implements Remotecontrol{
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>Remotecontrol.MAX_VOLUME) {
			System.out.println("Audio 볼륨의 최대치 값은 10입니다.");
		}else if(volume<Remotecontrol.MIN_VOLUME) {
			System.out.println("Audio 볼륨의 최소치 값은 0입니다.");
		}else {
			this.volume=volume;
		}
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
}

class Television implements Remotecontrol{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>Remotecontrol.MAX_VOLUME) {
			System.out.println("TV 볼륨의 최대치 값은 10입니다.");
			this.volume=Remotecontrol.MAX_VOLUME;
		}else if(volume<Remotecontrol.MIN_VOLUME) {
			System.out.println("TV 볼륨의 최소치 값은 0입니다.");
			this.volume=Remotecontrol.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("TV에 현재 볼륨: "+this.volume);
	}
}
public class google_oop_interface_Remotecontrol {

	public static void main(String[] args) {
		Remotecontrol rc=new Television();
		rc.turnOn();
		rc.setVolume(20);
		
		rc.setVolume(-10);
		rc.turnOff();
		
		System.out.println();
		rc=null;
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(-39);
		rc.turnOff();
	}

}
