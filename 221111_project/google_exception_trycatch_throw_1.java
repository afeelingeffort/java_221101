
public class google_exception_trycatch_throw_1 {
    public static void main(String[] args) {
        try {
            System.out.println("start");
            String str = "hello";
            int num = Integer.parseInt(str);

            System.out.println("num= " + num);
        } catch (NumberFormatException error) {
            // ...
        } catch (IllegalArgumentException error) {
            System.out.println("Invalid str");
        }

        System.out.println("end");
    }
}
