class Parent {
    void parentMethod() {
    }
}

class Child extends Parent {
    /*
     * 오버라이딩 했으나 실수로 이름을 잘못 적음.(그런데도 오류가 안 뜸. 그래서 찾기 어려움.)
     * 그러나 @Override를 붙이면 컴파일러가 같은 이름의 메서드가 조상에 있는지 확인하고 에러메시지를 출력해줌.
     */

    // @Override
    void parentmethod() {
    }
}

public class java_p484_Override_Annotation_ex12_7 {

    public static void main(String[] args) {

    }

}
