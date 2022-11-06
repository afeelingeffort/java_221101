class Marine{
	String name;
	int hp;
	
	public Marine(String name, int hp) {
		this.name=name;
		this.hp=hp;
	}
	
	public void stimpack() {
		System.out.printf("[%s]의 스팀팩 HP: %d",name, hp);
		hp-=10;
		System.out.printf("%d\n",hp);
	}
}

class Medic{
	String name;
	int hp;
	
	public Medic(String name, int hp) {
		this.name=name;
		this.hp=hp;
	}
	
	public void heal(Marine target) {
		System.out.printf("[%s]의 치유 %s HP(%d ->", name, target.name, target.hp);
		target.hp+=10;
		System.out.printf("%d)\n",target.hp);
	}
}
public class google_oop_method_StarCraft {

	public static void main(String[] args) {
		Marine marine=new Marine("마린",80);
		Medic medic=new Medic("메딕", 60);
		
		marine.stimpack();
		
		medic.heal(marine);		//medic이 힐을해서 marine에게 준다.
	}
	

}
