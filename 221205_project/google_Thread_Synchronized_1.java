
public class google_Thread_Synchronized_1 {

	public static void main(String[] args) {
		MethodClass mc=new MethodClass();
		
		ThreadClass tc1=new ThreadClass(mc, 3);
		ThreadClass tc2=new ThreadClass(mc, 7);
		tc1.start();
		tc2.start();
	}

}
class MethodClass{
	public synchronized void increMethod(int i) {
		for(int j=0; j<5; j++) {
			System.out.println(j*i);
			try {
				Thread.sleep(400);
			} catch(Exception e) {}
		}
	}
}

class ThreadClass extends Thread{
	MethodClass mc;
	int i;
	
	public ThreadClass(MethodClass mc, int i) {
		this.mc=mc;
		this.i=i;
	}
	
	public void run() {
		mc.increMethod(i);
	}
}