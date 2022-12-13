import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    String getName() {
        return name;
    }

    boolean isMale() {
        return isMale;
    }

    int getHack() {
        return hak;
    }

    int getBan() {
        return ban;
    }

    int getScore() {
        return score;
    }

    public String toString() {
        return String.format("[%s, %s, %d학년 %d반, %3d점]", name, isMale ? "남" : "여", hak, ban, score);
    }

    enum Level {
        HIGH, MID, LOW
    }
}

public class java_p608_Stream_partitioningBy_ex14_10 {

    public static void main(String[] args) {
        Student[] stuArr = {
                new Student("가자바", true, 1, 1, 300),
                new Student("나자바", false, 1, 1, 250),
                new Student("다자바", true, 1, 1, 200),
                new Student("라자바", false, 1, 2, 150),
                new Student("마자바", true, 1, 2, 100),
                new Student("바자바", false, 1, 3, 50),
                new Student("사자바", false, 1, 2, 200),
                new Student("아자바", true, 1, 1, 50),
                new Student("자자바", false, 1, 3, 200),
                new Student("차자바", true, 1, 2, 250),
                new Student("카자바", true, 1, 1, 300),
                new Student("타자바", false, 1, 1, 150),
                new Student("파자바", true, 1, 3, 100),
                new Student("하자바", false, 1, 1, 300)
        };

        System.out.printf("1. 단순분할(성별로 분할)%n");
        Map<Boolean, List<Student>> stuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale));

        List<Student> maleStudent = stuBySex.get(true);
        List<Student> femaleStudent = stuBySex.get(false);

        for (Student s : maleStudent)
            System.out.println(s);
        for (Student s : femaleStudent)
            System.out.println(s);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, counting()));

        System.out.println("남학생 수: " + stuNumBySex.get(true));
        System.out.println("여학생 수: " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할 + 통계(성별 1등)%n");
        Map<Boolean, Optional<Student>> topScoreBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale, maxBy(comparingInt(Student::getScore))));
        System.out.println("남학생 1등: " + topScoreBySex.get(true));
        System.out.println("여학생 1등: " + topScoreBySex.get(false));

        Map<Boolean, Student> topScoreBySex2 = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale,
                        collectingAndThen(maxBy(comparingInt(Student::getScore)), Optional::get)));

        System.out.println("남학생 1등: " + topScoreBySex.get(true));
        System.out.println("여학생 1등: " + topScoreBySex.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100점 이하)%n");

        Map<Boolean, Map<Boolean, List<Student>>> failedStuBySex = Stream.of(stuArr)
                .collect(partitioningBy(Student::isMale,
                        partitioningBy(s -> s.getScore() <= 100)));
        List<Student> failedMaleStu = failedStuBySex.get(true).get(true);
        List<Student> failedFemaleStu = failedStuBySex.get(false).get(false);

        for (Student s : failedMaleStu)
            System.out.println(s);
        for (Student s : failedFemaleStu)
            System.out.println(s);
    }
}