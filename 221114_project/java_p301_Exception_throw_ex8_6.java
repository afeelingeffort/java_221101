
public class java_p301_Exception_throw_ex8_6 {

    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생시킴");
            throw e;
            // throw new Exception("고의로 발생시킴"); 으로 줄일 수 있다.
        } catch (Exception e) {
            System.out.println("에러 메세지: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }

}
