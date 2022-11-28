class Student implements Comparable<Student> {
    int age;
    int classNumber;

    Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    public int compareTo(Student o) {
        /*
         * if(this.age>o.age) {
         * return 1;
         * } else if(this.age==o.age) {
         * return 0;
         * } else {
         * return -1;
         * }
         * }
         */
        return this.age - o.age;
    }
}

public class google_FrameWork_Comparable_compareTo_Student {

    public static void main(String[] args) {
        Student a = new Student(17, 2);
        Student b = new Student(18, 1);

        int isBig = a.compareTo(b); // a자기자신과 b객체를 비교.
        if (isBig > 0) {
            System.out.println("a객체가 b객체보다 큽니다.");
        } else if (isBig == 0) {
            System.out.println("두 객체의 크기가 같습니다.");
        } else {
            System.out.println("a객체가 b객체보다 작습니다.");
        }
    }

}
