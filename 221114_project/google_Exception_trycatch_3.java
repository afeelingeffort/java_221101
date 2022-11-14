// 예외를 처리하는 순서는 위에서부터 차례대로 내려오기 때문에 순서를 잘 지정해야함.
public class google_Exception_trycatch_3 {

    public static void main(String[] args) {
        try {
            Class cl = Class.forName("java.lang.String");
            int[] arr = { 0, };
            arr[3] = 0;
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 크기를 확인하세요.");
        } finally {
            System.out.println("예외 처리가 작동중입니다.");
        }
    }

}