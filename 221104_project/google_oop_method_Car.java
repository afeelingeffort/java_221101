class Car{
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else {
			this.speed=speed;
		}
	}
	
	public boolean getStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop=stop;
	}
}
public class google_oop_method_Car {

	public static void main(String[] args) {
		Car c=new Car();
		c.setSpeed(100);
	}

}
