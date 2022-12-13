
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

class Student2 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student2(String name, boolean isMale, int hak, int ban, int score) {
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

    int getHak() {
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

public class java_p613_Stream_groupingBy_ex14_11 {

    public static void main(String[] args) {
        Student2[] stuArr = {
                new Student2("가자바", true, 1, 1, 300),
                new Student2("나자바", false, 1, 1, 250),
                new Student2("다자바", true, 1, 1, 200),
                new Student2("라자바", false, 1, 2, 150),
                new Student2("마자바", true, 1, 2, 100),
                new Student2("바자바", false, 1, 3, 50),
                new Student2("사자바", false, 1, 2, 200),
                new Student2("아자바", true, 1, 1, 50),
                new Student2("자자바", false, 1, 3, 200),
                new Student2("차자바", true, 1, 2, 250),
                new Student2("카자바", true, 1, 1, 300),
                new Student2("타자바", false, 1, 1, 150),
                new Student2("파자바", true, 1, 3, 100),
                new Student2("하자바", false, 1, 1, 300)
        };

        System.out.printf("1. 단순그룹화(반별로 그룹화)%n");
        Map<Integer, List<Student2>> stuByBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getBan));

        for (List<Student2> ban : stuByBan.values()) {
            for (Student2 s : ban) {
                System.out.println(s);
            }
        }

        System.out.printf("%n2. 단순그룹화(성적별로 그룹화)%n");
        Map<Student2.Level, List<Student2>> stuByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200)
                        return Student2.Level.HIGH;
                    else if (s.getScore() >= 100)
                        return Student2.Level.MID;
                    else
                        return Student2.Level.LOW;
                }));

        TreeSet<Student2.Level> keySet = new TreeSet<>(stuByLevel.keySet());

        for (Student2.Level key : keySet) {
            System.out.println("[" + key + "]");

            for (Student2 s : stuByLevel.get(key))
                System.out.println(s);
            System.out.println();
        }

        System.out.printf("%n3. 단순그룹화 + 통계(성적별 학생수)%n");
        Map<Student2.Level, Long> stuCntByLevel = Stream.of(stuArr)
                .collect(groupingBy(s -> {
                    if (s.getScore() >= 200)
                        return Student2.Level.HIGH;
                    else if (s.getScore() >= 100)
                        return Student2.Level.MID;
                    else
                        return Student2.Level.LOW;
                }, counting()));

        for (Student2.Level key : stuCntByLevel.keySet())
            System.out.printf("[%s]-%d명, ", key, stuCntByLevel.get(key));
        System.out.println();

        System.out.printf("%n4. 다중그룹화(학년별, 반별)");
        Map<Integer, Map<Integer, List<Student2>>> stuByHackAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getHak, groupingBy(Student2::getBan)));

        for (Map<Integer, List<Student2>> hak : stuByHackAndBan.values()) {
            for (List<Student2> ban : hak.values()) {
                System.out.println();
                for (Student2 s : ban)
                    System.out.println(s);
            }
        }

        System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별 1등)%n");
        Map<Integer, Map<Integer, Student2>> topStuByHakAndBan = Stream.of(stuArr)
                .collect(groupingBy(Student2::getHak, groupingBy(Student2::getBan,
                        collectingAndThen(
                                maxBy(comparingInt(Student2::getScore)), Optional::get))));

        for (Map<Integer, Student2> ban : topStuByHakAndBan.values())
            for (Student2 s : ban.values())
                System.out.println(s);

        System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적그룹)%n");
        Map<String, Set<Student2.Level>> stuByScoreGroup = Stream.of(stuArr)
                .collect(groupingBy(s -> s.getHak() + "-" + s.getBan(),
                        mapping(s -> {
                            if (s.getScore() >= 200)
                                return Student2.Level.HIGH;
                            else if (s.getScore() >= 100)
                                return Student2.Level.MID;
                            else
                                return Student2.Level.LOW;
                        }, toSet())));

        Set<String> keySet2 = stuByScoreGroup.keySet();

        for (String key : keySet2) {
            System.out.println("[" + key + "]" + stuByScoreGroup.get(key));
        }
    }

}
