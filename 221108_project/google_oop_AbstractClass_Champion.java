abstract class Champion{
	String spell="";
	
	public abstract void chooseOne();
	
	public void start() {
		chooseOne();
		
		System.out.println("Spell : "+spell);
	}
}

class Top extends Champion{
	public void chooseOne() {
		this.spell="점멸";
		
		System.out.println("Top: 티모");
	}
}

class Mid extends Champion{
	public void chooseOne() {
		this.spell="유채화";
		
		System.out.println("Mid: 유미");
	}
}

class Bottom extends Champion{
	public void chooseOne() {
		this.spell="회복";
		
		System.out.println("Bottom: 제라스");
	}
}



public class google_oop_AbstractClass_Champion {

	public static void main(String[] args) {
		Top top=new Top();
		top.start();
		
		Mid mid=new Mid();
		mid.start();
		
		Bottom bottom=new Bottom();
		bottom.start();
	}

}
