
public class google_exception_trycatch_1 {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException 발생");
            System.out.println("0으로 나눌 수는 없습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("finally 실행");
        }
    }
}
