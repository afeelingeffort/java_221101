class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }

    public String toString(String k, int n) {
        return "kind : " + k + ", number : " + n;
    }
}

public class java_p329_java_lang_package_toString_overriding {

    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 10);
        System.out.println(c1.toString());
        System.out.println(c2.toString("HEART", 10)); // 왜 오류나는지 물어보기.
    }

}
