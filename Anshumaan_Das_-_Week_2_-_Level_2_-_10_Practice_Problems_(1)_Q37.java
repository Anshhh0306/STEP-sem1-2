import java.util.Scanner;

public class W2L2Q37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter positive number: ");
            num = scanner.nextInt();
        } while (num <= 0);
        System.out.println("Valid: " + num);
    }
}