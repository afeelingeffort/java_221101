interface ChampInter{
	String spell="없음";
	
	public void chooseOne(String name);
}

class Top2 implements ChampInter{
	public void chooseOne(String name) {
		System.out.println("Top: "+name+"/spell: "+spell);
	}
}
public class google_oop_Interface_ChampInter {

	public static void main(String[] args) {
		Top2 top=new Top2();
		top.chooseOne("티모");
	}

}
