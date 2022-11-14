
class CustomException extends Exception {

    public CustomException() {
        System.out.println("CustomException에서 예외처리");
    }
}

public class google_Exception_array_throw {

    public static void main(String[] args) {
        try {
            throw new CustomException();
        } catch (Exception e) {
            // CustomException()외의 예외처리
        }
    }

}