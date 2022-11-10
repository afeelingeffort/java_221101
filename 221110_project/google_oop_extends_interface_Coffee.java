class Coffee extends Recipe{
	
	public void brew() {
		System.out.println("필터를 활용해 커피를 내린다.");
	}
	
	public void addCondiments() {
		System.out.println("설탕과 우유를 추가한다.");
	}
}

class Tea extends Recipe{

	public void brew() {
		System.out.println("티백을 담근다.");
	}
	
	public void addCondiments() {
		System.out.println("레몬을 추가한다.");
	}
}

// boilWater()와 pourInCup() 메서드의 이름과 기능이 같다.

abstract class Recipe{
	abstract void brew();
	
	abstract void addCondiments();
	
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	protected void boilWater() {	//상속을 할 거라 protected로 !!
		System.out.println("물을 끓인다.");
	}
	
	protected void pourInCup() {
		System.out.println("컵에 붓는다.");
	}
}
public class google_oop_extends_interface_Coffee {

	public static void main(String[] args) {
		Coffee c=new Coffee();
		c.prepareRecipe();
	}

}
