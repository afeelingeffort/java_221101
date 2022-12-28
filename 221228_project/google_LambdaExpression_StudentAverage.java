import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class google_LambdaExpression_StudentAverage {
    class Student {
        private int stuNum;
        private String stuName;
        private int math;
        private int english;

        Student(int stuNum, String stuName, int math, int english) {
            this.stuNum = stuNum;
            this.stuName = stuName;
            this.math = math;
            this.english = english;
        }

        public int getMath() {
            return math;
        }

        public int getEnglish() {
            return english;
        }
    }

    public static void main(String[] args) {
        google_LambdaExpression_StudentAverage test = new google_LambdaExpression_StudentAverage();

        List<Student> list = Arrays.asList(
                test.new Student(11, "조성모", 27, 25), test.new Student(13, "성시경", 37, 26),
                test.new Student(14, "이승철", 36, 81), test.new Student(15, "이수영", 37, 24));

        ToDoubleFunction<Student> toDoubleFunction = student -> (double) (student.getMath() + student.getEnglish()) / 2;

        test.testT(toDoubleFunction, list);
    }

    void testT(ToDoubleFunction function, List<Student> list) {
        double sum = 0;
        for (Student stu : list) {

            double score = function.applyAsDouble(stu);
            System.out.println(stu.stuName + "의 평균점수: " + score);
            sum += score;
        }
        double stuAverage = sum / list.size();
        System.out.println("점수 총 평균: " + stuAverage);
    }
}