
//리플렉션 어노테이션의 값 가져오기. 근데 안 가져와짐. 
import java.lang.reflect.Method;

@interface MyAnnotation {
    String value() default "MyAnnotation : default value";
}

class MyObject {
    @MyAnnotation
    public void testMethod1() {
        System.out.println("This is testMethod1");
    }

    @MyAnnotation(value = "My new Annotation")
    public void testMethod1() {
        System.out.println("This is testMethod1");
    }
}

public class google_Custom_Annotation {

    public static void main(String[] args) {
        Method[] methodList = MyObject.class.getMethods();

        for (Method method : methodList) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);

                String value = annotation.value();
                System.out.println(method.getName() + ":" + value);
            }
        }
    }

}
