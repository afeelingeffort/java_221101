import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "160101", hhmmss = "235959"))

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;

    String testedBy();

    String[] testTools() default "JUnit";

    TestType testType() default TestType.FIRST;

    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();

    String hhmmss();
}

enum TestType {
    FIRST, FINAL
}

public class java_p500_Annotation_Ex12_8 {

    public static void main(String[] args) {
        Class<java_p500_Annotation_Ex12_8> cls = java_p500_Annotation_Ex12_8.class;

        TestInfo anno = cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy()=" + anno.testedBy());
        System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());

        for (String str : anno.testTools())
            System.out.println("testTools=" + str);

        System.out.println();

        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr)
            System.out.println(a);
    }

}
