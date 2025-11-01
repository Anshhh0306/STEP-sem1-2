import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

public class W2L3Q27 {
    @MyAnnotation("Test method")
    public void testMethod() {
        System.out.println("This is a test method.");
    }

    public static void main(String[] args) {
        W2L3Q27 obj = new W2L3Q27();
        try {
            Method method = obj.getClass().getMethod("testMethod");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                System.out.println("Annotation value: " + annotation.value());
            }
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}