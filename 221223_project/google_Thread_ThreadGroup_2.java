
public class google_Thread_ThreadGroup_2 {

	public static class WorkerThread extends Thread{
		public WorkerThread(ThreadGroup group, String name) {
			super(group, name);
		}
		
		public void run() {
			while(!Thread.currentThread().isInterrupted()) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					break;
				}
			}
			
			System.out.println(Thread.currentThread().getName()+" Interrupted");
		}
	}
	
	public static void main(String[] args) {
		ThreadGroup group=new ThreadGroup("New thread group");
		
		Thread t1=new WorkerThread(group, "Thread1");
		Thread t2=new WorkerThread(group, "Thread2");
		Thread t3=new WorkerThread(group, "Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		System.out.println("Call interrupt");
		
		group.interrupt();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch(InterruptedException e) {}
		
		System.out.println("Finished");
	}

}
