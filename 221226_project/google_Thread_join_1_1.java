
class MyThread2 implements Runnable{
	private String threadName;
	public MyThread2(String threadName){
		this.threadName=threadName;
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(threadName+":"+i);
		}
	}
}

public class google_Thread_join_1_1 {

	public static void main(String[] ar) throws InterruptedException{
		System.out.println("MainThread Start");
		Thread[] thread=new Thread[4];
		
		for(int i=1;i<=3;i++){
			thread[i]=new Thread(new MyThread("Thread"+i));
			thread[i].start();
			thread[i].join();
		}
		
		
		System.out.println("MainThread End");	
	}
	
}