class Dog{
	private String name;
	private String type;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String showDogInfo() {
		return name+", "+type;
	}
}
public class google_oop_Dog {

	public static void main(String[] args) {
		Dog[] doglist=new Dog[2];
		doglist[0]=new Dog();
		doglist[0].setName("해피");
		doglist[0].setType("포메라니안");
		doglist[1]=new Dog();
		doglist[1].setName("건강");
		doglist[1].setType("시고르자브종");

		for(Dog d: doglist) {
			System.out.println(d.showDogInfo());
		}
	}

}
