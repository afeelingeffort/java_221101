
public class google_Exception_array_trycatch {

    public void call(int j) {
        try {
            int[] i = { 1, 2, 3 };
            System.out.println("call value: " + i[j]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 크기에 맞는 값을 입력하세요.");
            e.printStackTrace();
        } finally {
            System.out.println("해당 문장은 무조건 수행");
        }

    }

    public static void main(String[] args) {
        google_Exception_array_trycatch et = new google_Exception_array_trycatch();
        et.call(4);
    }
}

// ExceptionTest et=new ExceptionTest();
// et.call(4);
// }
// public void call(int j) {
// int[] i = { 1, 2, 3 };
// System.out.println("call value : " + i[j]);
