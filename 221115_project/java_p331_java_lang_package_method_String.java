
public class java_p331_java_lang_package_method_String {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("String str1=\"abc\";");
        System.out.println("String strr=\"abc\";");

        System.out.println("str1==str2? " + (str1 == str2));
        System.out.println("str1.equals(str2) ?" + str1.equals(str2));
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("String str3=newString(\"abc\");");
        System.out.println("String str4=newString(\"abc\");");

        System.out.println("str3==str4? " + (str3 == str4));
        System.out.println("str3.equals(str4) ?" + str3.equals(str4));
    }

}
