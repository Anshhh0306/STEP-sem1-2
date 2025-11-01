import java.util.Scanner;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

class SampleClass {
    private int value = 42;
    public String name = "Sample";

    public void printMessage() {
        System.out.println("Hello from SampleClass!");
    }

    private void privateMethod() {
        System.out.println("This is private!");
    }
}

public class W2L3Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter class name to inspect: ");
        String className = scanner.nextLine();

        try {
            Class<?> clazz = Class.forName(className);
            System.out.println("Class: " + clazz.getName());

            // Fields
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("Fields:");
            for (Field field : fields) {
                System.out.println("  " + field.getName() + " (" + field.getType().getSimpleName() + ")");
            }

            // Methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println("  " + method.getName());
            }

            // Invoke a method if it's public
            if (methods.length > 0) {
                Method method = methods[0];
                if (method.getParameterCount() == 0) {
                    Object instance = clazz.getDeclaredConstructor().newInstance();
                    method.invoke(instance);
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}