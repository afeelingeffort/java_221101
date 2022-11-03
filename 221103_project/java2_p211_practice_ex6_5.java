
public class java2_p211_practice_ex6_5 {

	public static void main(String[] args) {
		Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

		System.out.println(s.info());
	}

}

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 뭔가 이상함
	public String info() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + (kor + eng + math) + ","+((float)(kor + eng + math))/3;
	}
}
