import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class W2L3Q10 {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        if (memo.containsKey(n)) return memo.get(n);
        long result = n * factorial(n - 1);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
    }
}