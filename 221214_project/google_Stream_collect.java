import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Member {
    public enum Gender {
        MALE, FEMALE
    };

    private String name;
    private int age;
    private Gender gender;

    public Member(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

}

public class google_Stream_collect {

    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("Kim", 21, Member.Gender.MALE),
                new Member("Lee", 24, Member.Gender.FEMALE),
                new Member("Park", 26, Member.Gender.FEMALE),
                new Member("Choi", 23, Member.Gender.MALE));

        List<Member> maleList = list.stream()
                .filter(s -> s.getGender() == Member.Gender.MALE)
                .collect(Collectors.toList());

        maleList.stream().forEach(n -> System.out.println(n.getName()));

        Set<Member> maleSet = list.stream()
                .filter(s -> s.getGender() == Member.Gender.MALE)
                .collect(Collectors.toCollection(HashSet::new));

        maleSet.stream().forEach(n -> System.out.println(n.getName() + " " + n.getAge()));

        Set<Member> femaleSet = list.stream()
                .filter(s -> s.getGender() == Member.Gender.FEMALE)
                .collect(Collectors.toCollection(HashSet::new));

        femaleSet.stream().forEach(n -> System.out.println(n.getName() + " " + n.getAge()));
    }

}
