interface Animal3{
	void species();
	void sex();
}

interface Human{
	void name();
	void age();
}

class Intergrated implements Human, Animal3{
	private String name;
	private int age;
	private String sex;
	private String species;
	
	public Intergrated(String name, int age, String sex, String species) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.species=species;
	}
	
	public void name() {
		System.out.println("저의 이름은 "+name+" 입니다.");
	}
	
	public void age() {
		System.out.println("저의 나이는 "+age+" 입니다.");
	}
	
	public void species() {
		System.out.println("이 동물은 "+species+" 입니다.");
	}
	
	public void sex() {
		System.out.println("이 동물은 "+sex+" 입니다.");
	}
}
public class google_oop_interface_Animal_Human {

	public static void main(String[] args) {
		Intergrated it=new Intergrated("king",22, "Lion", "수컷");
		
		it.name();
		it.age();
		it.species();
		it.sex();
	}

}
