import java.util.Optional;

public class java_p592_Optional_null {

    public static void main(String[] args) {
        // int[] arr=null;
        int[] arr = new int[0];
        System.out.println("arr.length=" + arr.length); // null로 저장하면 NullPointerException 발생

        // Optional<String> opt=null; //바람직하지 않음.
        Optional<String> opt = Optional.empty();
        Optional<String> opt2 = Optional.of("abc");
        System.out.println("opt=" + opt);

        String str = "";
        /*
         * try {
         * str=opt.get();
         * } catch(Exception e) {
         * str="";
         * }
         */
        str = opt2.orElse("EMPTY"); // try-catch문을 쓰기엔 번거롭기에 orElse()사용하기.
        str = opt2.orElseGet(() -> ""); // orElseGet()은 람다식을 쓸 수 있음.
        System.out.println("str=" + str);
    }

}
