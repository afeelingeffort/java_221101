import java.util.ArrayList;

public class google_Thread_join_1 extends Thread{
	int seq;
	public google_Thread_join_1(int seq) {
		this.seq=seq;
	}
	
	public void run() {
		System.out.println(this.seq+" thread start");
		try {
			Thread.sleep(1000);
		} catch(Exception e) {}
		
		System.out.println(this.seq+" thread end");
	}
	
	public static void main(String[] args) {
		ArrayList<Thread> th=new ArrayList<>();
		for(int i=0; i<10; i++) {
			Thread t=new google_Thread_join_1(i);
			t.start();
			th.add(t);
		}
		
		for(int i=0; i<th.size(); i++) {
			Thread t=th.get(i);
			try {
				t.join();
			} catch(Exception e) {}
		}
		
		System.out.println("main end");
	}
	

}
