class MyTv2{	//물어보기
	private int channel;
	
	MyTv2(){}
	MyTv2(int channel){
		this.channel=channel;
	}
	
	public void setChannel(int channel) {
		this.channel=channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
//	public void gotoPrevChannel() {
//		this.channel=channel;
//	}
}
public class java_p286_oop_ex7_5 {

	public static void main(String[] args) {
		MyTv2 t=new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: "+t.getChannel());
		t.setChannel(20);
		System.out.println("CH: "+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: "+t.getChannel());
	}

}
