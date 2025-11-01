import java.lang.reflect.*;

public class Q13_15 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.util.ArrayList");
            System.out.println("Class: " + c.getName());
            Method[] methods = c.getMethods();
            for (Method m : methods) {
                System.out.println("Method: " + m.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}