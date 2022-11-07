class Student {
	private static int serialNum = 1000;
	private int studentID;
	private String studentName;
	private static int studentCard;

	public void Student(String studentName) {
		setStudentName(studentName);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String sutdentName) {
		this.studentName = studentName;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public int getStudentCard() {
		return studentCard;
	}

	public Student() {
		serialNum++;
		studentID = serialNum;
		studentCard = studentID + 100;
	}
}

public class google_oop_method_Student {

	public static void main(String[] args) {
		Student std = new Student();
		std.setStudentName("한석봉");		//이름이 왜 null로 나오는지.
		System.out.println("학생이름: " + std.getStudentName() + ", 학생 번호: " + std.getSerialNum() + ", 카드 번호: "
				+ std.getStudentCard());

		Student std2 = new Student();
		std2.setStudentName("정약용");
		System.out.println("학생이름: " + std2.getStudentName() + ", 학생 번호: " + std2.getSerialNum() + ", 카드 번호: "
				+ std2.getStudentCard());

		Student std3 = new Student();
		std3.setStudentName("장영실");
		System.out.println("학생이름: " + std3.getStudentName() + ", 학생 번호: " + std3.getSerialNum() + ", 카드 번호: "
				+ std3.getStudentCard());
	}

}
