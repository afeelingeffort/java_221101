
public class java_p325_java_lang_package_method_equals {

    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10); // 서로 다른 두 객체는 항상 주소가 다름.

        if (v1.equals(v2)) {
            System.out.println("v1과 v2는 같습니다.");
        } else {
            System.out.println("v1과 v2는 다릅니다.");
        }
    }

}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    /*
     * public boolean equals(Object obj) {
     * if (!(obj instanceof Value))
     * return false;
     * Value v = (Value) obj;
     * return this.value == v.value;
     * }
     */
}
