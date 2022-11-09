//다시

class Tv{
	protected boolean power;
	protected int channel;
	protected int volume;
	
	public void power() {
		power=!power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	public void volumeUp() {
		volume++;
	}
	public void voumeDown() {
		volume--;
	}
}

class TVCR{
	protected int counter;
	
	public void play() {
		System.out.println("Tape 재생");
	}
	public void stop() {
		System.out.println("Tape 재생 멈춤");
	}
	public void reset() {
		counter=0;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int c) {
		counter=c;
	}
}

interface IVCR{
	public void play();
	public void stop();
	public void reset();
	public int getCounter();
	public void setCounter(int c);
}


public class java2_p298_oop_interface_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
