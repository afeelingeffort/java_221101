interface ChampInter3{
	public void chooseOne(String name);
}

interface SpellInter3{
	public void chooseTwo(String name1, String name2);
}

class Top3 implements ChampInter3, SpellInter3{
	public void chooseOne(String name) {
		System.out.println("Top: "+name);
	}
	
	public void chooseTwo(String name1, String name2) {
		System.out.println("Spell: "+name1+"/"+name2);
	}
}
public class google_oop_multipleInterface_ChampInter {

	public static void main(String[] args) {
		Top3 top3=new Top3();
		top3.chooseOne("티모");
		top3.chooseTwo("순간이동", "점멸");
	}

}
