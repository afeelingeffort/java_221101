
public class google_exception_trycatch_ArrayIndexException {

    public static void main(String[] args) {
        System.out.println("Start program");

        int[] tmpArr = { 1, 2, 3 };

        try {
            printArrayItem(tmpArr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Finish program");
        }
    }

    private static void printArrayItem(int[] array) {
        System.out.println("first : " + array[0]);
        System.out.println("first : " + array[1]);
        System.out.println("first : " + array[2]);
        System.out.println("first : " + array[3]);
    }

}