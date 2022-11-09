abstract class Games{
	public abstract void start();
	
	public void stop() {
		System.out.println("Stopping game in abstract class");
	}
}

class GameA extends Games{
	public void start() {
		System.out.println("Starting Game A");
	}
}

class GameB extends Games{
	public void start() {
		System.out.println("Starting Gmae B");
	}
}
public class google_oop_abstractClass_Games {

	public static void main(String[] args) {
		GameA a=new GameA();
		GameB b=new GameB();
		
		a.start();
		a.stop();
		
		b.start();
		b.stop();
	}

}
