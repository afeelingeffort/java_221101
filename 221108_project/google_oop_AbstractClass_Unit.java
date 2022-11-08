abstract class Unit{
	int x;
	int y;
	String str;
	
	public abstract void move(int x, int y);
	
	public void stop(String str, int x, int y) {
		this.x=x;
		this.y=y;
		this.str=str;
		
		System.out.println("현재위치: "+this.x+", "+this.y+"에 "+this.str+"가/이 멈춥니다.");
	}
}

class Tank extends Unit{
	public Tank() {}
	
	public void move(int x, int y) {
		System.out.println("탱크의 위치: "+x+", "+y+"로 이동함.");
	}
	
	public void sizeMode() {
		System.out.println("공격모드: 시즈모드 변환");
	}
}

class Marine extends Unit{
	public Marine() {}
	
	public void move(int x, int y) {
		System.out.println("마린의 위치: "+x+", "+y+"로 이동함.");
	}
	
	public void stimPack() {
		System.out.println("공격모드: 스팀팩 장전");
	}
}

class DropShip extends Unit{
	public DropShip() {}
	
	public void move(int x, int y) {
		System.out.println("드람쉽의 위치: "+x+", "+y+"로 이동함.");
	}
	
	public void load() {
		System.out.println("탐승모드: 유닛 탑승");
	}
	
	public void unload() {
		System.out.println("탑승모드: 유닛 하강");
	}
}
public class google_oop_AbstractClass_Unit {

	public static void main(String[] args) {
		System.out.println("-----------------------------------");
		Tank tank=new Tank();
		tank.move(100, 200);
		tank.sizeMode();
		tank.stop("탱크", 300, 400);
		
		System.out.println("-----------------------------------");
		Marine marine=new Marine();
		marine.move(100, 300);
		marine.stimPack();
		marine.stop("마린", 50, 50);
		
		System.out.println("-----------------------------------");
		DropShip ds=new DropShip();
		ds.move(500, 500);
		ds.load();
		ds.unload();
		ds.stop("드랍쉽", 20, 300);
	}

}
