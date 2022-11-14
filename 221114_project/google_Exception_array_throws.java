
public class google_Exception_array_throws {

    public static void main(String[] args) {
        google_Exception_array_throws et = new google_Exception_array_throws();

        try {
            et.call(4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 크기에 맞는 값을 입력하세요.");
            e.printStackTrace();
        } finally {
            System.out.println("해당 문장은 무조건 수행.");
        }
    }

    public void call(int j) throws ArrayIndexOutOfBoundsException {
        int[] i = { 1, 2, 3 };
        System.out.println("call value : " + i[j]);
    }

}