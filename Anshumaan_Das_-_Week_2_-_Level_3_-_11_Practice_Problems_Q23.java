import java.util.Scanner;

public class W2L3Q23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        } finally {
            System.out.println("Operation completed.");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}