class MyTv3{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	final int MAX_VOLUME=100;
	final int MIN_VOLUME=0;
	final int MAX_CHANNEL=100;
	final int MIN_CHANNEL=1;
	
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME || volume<MIN_VOLUME)
			return;
		this.volume=volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel>MAX_CHANNEL || channel<MIN_CHANNEL)
			return;
		prevChannel=this.channel;
		this.channel=channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);	//현재 채널을 이전 채널로 변경한다.
	}
}
public class google_oop_MyTv3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
