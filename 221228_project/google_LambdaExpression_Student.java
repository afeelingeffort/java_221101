import java.util.function.*;

public class google_LambdaExpression_Student {
    Consumer<String> c1 = a -> System.out.println("입력값 : " + a);
    BiConsumer<String, Integer> c2 = (a, b) -> System.out.println("입력값1 : " + a + " 입력값2 : " + b);
    IntConsumer c3 = a -> System.out.println("입력값 : " + a);
    DoubleConsumer c4 = a -> System.out.println("입력값 : " + a);
    LongConsumer c5 = a -> System.out.println("입력값 : " + a);
    ObjIntConsumer<Student> c6 = (a, b) -> System.out.println("이름 : " + a.name + " 숫자 : " + b);
    ObjDoubleConsumer<Student> c7 = (a, b) -> System.out.println("이름 : " + a.name + " 숫자 : " + b);
    ObjLongConsumer<Student> c8 = (a, b) -> System.out.println("이름 : " + a.name + " 숫자 : " + b);

    class Student {
        private String name;

        Student(String name) {
            this.name = name;
        };
    }

    public static void main(String[] args) {
        google_LambdaExpression_Student test = new google_LambdaExpression_Student();

        test.c1.accept("김유신");
        test.c2.accept("홍길동", 123);
        test.c3.accept(456);
        test.c4.accept(123.45);
        test.c5.accept(1232345);

        Student student = test.new Student("이순신");
        test.c6.accept(student, 12);
        test.c7.accept(student, 23.24);
        test.c8.accept(student, 98765);
    }
}