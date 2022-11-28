import java.util.Comparator;

class Student2 implements Comparator<Student2> {
    int age;
    int classNumber;

    Student2(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }

    public int compare(Student2 o1, Student2 o2) {
        /*
         * if(o1.classNumber>o2.classNumber) {
         * return 1;
         * } else if(o1.classNumber==o2.classNumber) {
         * return 0;
         * } else {
         * return -1;
         * }
         */
        return o1.classNumber - o2.classNumber;
    }
}

public class google_FrameWork_Comparator_compare_Student {

    public static void main(String[] args) {
        Student2 a = new Student2(17, 2);
        Student2 b = new Student2(18, 1);
        Student2 c = new Student2(15, 3);

        int isBig = a.compare(b, c);

        if (isBig > 0) {
            System.out.println("b객체가 c객체보다 큽니다.");
        } else if (isBig == 0) {
            System.out.println("두 객체의 크기가 같습니다.");
        } else {
            System.out.println("b객체가 c객체보다 작습니다.");
        }
    }

}