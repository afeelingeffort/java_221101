interface RemoteControl2{
	public static final int MAX_VOLUME=10;
	public static final int MIN_VOLUME=0;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	default void setifMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
		}else {
			System.out.println("무음 해제 합니다.");
		}
	}
	
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

class Audio2 implements RemoteControl2{
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl2.MAX_VOLUME) {
			this.volume=RemoteControl2.MAX_VOLUME;
		}else if(volume<RemoteControl2.MIN_VOLUME) {
			this.volume=RemoteControl2.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
}
public class google_oop_interface_RemoteControl2 {

	public static void main(String[] args) {
		RemoteControl2 rc=null;
		rc=new Audio2();
		rc.turnOn();
		rc.setVolume(7);
		rc.setifMute(true);
		RemoteControl2.changeBattery();
		rc.turnOff();
		
	}

}
