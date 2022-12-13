
import java.util.function.Function;

public class google_LambdaExpression_Constructor_MethodReference {

    public static void main(String[] args) {
        // 입력 X, 출력 O
        // Supplier<MyClass> s=()->new MyClass();
        // Supplier<MyClass> s=MyClass::new;

        Function<Integer, MyClass> f = (i) -> new MyClass(i);
        Function<Integer, MyClass> f2 = MyClass::new; // 위 문장을 더 간단히

        MyClass mc = f.apply(100); // MyClass 객체 반환
        System.out.println(mc.iv);

        System.out.println(f2.apply(200).iv);

    }

}

class MyClass {
    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }
}