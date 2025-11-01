import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println("Square: " + (num * num));
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}