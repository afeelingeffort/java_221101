
public class java_p296_Exception_ex8_1 {

    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0 / 0);
            System.out.println(2);
        } catch (ArithmeticException ae) {
            System.out.println(3);
        }
        System.out.println(4);
    }

}
