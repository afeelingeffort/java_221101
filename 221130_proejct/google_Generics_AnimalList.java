import java.util.ArrayList;

class LandAnimal{
	public void crying() {
		System.out.println("육지동물");
	}
}

class Cat extends LandAnimal{
	public void crying() {
		System.out.println("냐옹냐옹");
	}
}

class Dog extends LandAnimal{
	public void crying() {
		System.out.println("멍멍");
	}
}

class Sparrow{
	public void crying() {
		System.out.println("쨱쨱");
	}
}

class AnimalList<T>{
	ArrayList<T> al=new ArrayList<T>();
	
	void add(T animal) {
		al.add(animal);
	}
	
	T get(int index) {
		return al.get(index);
	}
	
	boolean remove(T animal) {
		return al.remove(animal);
	}
	
	int size() {
		return al.size();
	}
}
public class google_Generics_AnimalList {

	public static void main(String[] args) {
		AnimalList<LandAnimal> landAnimal=new AnimalList<>();
		
		landAnimal.add(new LandAnimal());
		landAnimal.add(new Cat());
		landAnimal.add(new Dog());
		//landAnimal.add(new Sparrow()); 는 오류남.
		
		for(int i=0; i<landAnimal.size(); i++)
			landAnimal.get(i).crying();
	}

}
