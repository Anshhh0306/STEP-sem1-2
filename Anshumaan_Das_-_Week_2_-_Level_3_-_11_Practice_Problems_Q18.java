import java.util.Scanner;

public class W2L3Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num > 0) {
            int remainder = num % 10;
            sum += Math.pow(remainder, digits);
            num /= 10;
        }
        return sum == originalNum;
    }
}