
public class java_p304_Exception_method_throws_ex8_9 {

    public static void main(String[] args) {
        method1();
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }

}
