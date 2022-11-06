class Code1{
		private String name;
		private int number;
		
		public Code1(String name, int number) {
			this.name=name; 
			this.number=number;
		}
		
		public String toString() {
			return name+"->"+number;
		}
	}
public class google_oop_toString_1 {

	public static void main(String[] args) {
		Code1 person=new Code1("mj",3333);
		System.out.println(person);	//toString() 자동호출
	}

}
