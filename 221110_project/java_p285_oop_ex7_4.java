// setter와 getter는 완벽히 이해함.
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	public void setChannel(int channel) {
		this.channel=channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	public int getVolume() {
		return volume;
	}
}
public class java_p285_oop_ex7_4 {

	public static void main(String[] args) {
		MyTv t=new MyTv();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL: "+t.getVolume());
	}

}
