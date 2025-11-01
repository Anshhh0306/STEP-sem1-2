import java.math.BigInteger;
import java.util.Scanner;

public class W2L3Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first large number: ");
        BigInteger a = new BigInteger(scanner.next());
        System.out.print("Enter second large number: ");
        BigInteger b = new BigInteger(scanner.next());

        System.out.println("Sum: " + a.add(b));
        System.out.println("Difference: " + a.subtract(b));
        System.out.println("Product: " + a.multiply(b));
        System.out.println("Division: " + a.divide(b));
        System.out.println("Modulus: " + a.mod(b));
        System.out.println("Power (a^10): " + a.pow(10));
        System.out.println("GCD: " + a.gcd(b));
    }
}