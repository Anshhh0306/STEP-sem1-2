import java.util.Optional;
import java.util.Scanner;

public class W2L3Q39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name (or nothing): ");
        String input = scanner.nextLine();

        Optional<String> name = Optional.ofNullable(input.isEmpty() ? null : input);
        name.ifPresentOrElse(
            n -> System.out.println("Hello, " + n + "!"),
            () -> System.out.println("Hello, Guest!")
        );

        // More Optional usage
        Optional<String> upper = name.map(String::toUpperCase);
        upper.ifPresent(s -> System.out.println("Uppercase: " + s));

        Optional<Integer> length = name.map(String::length);
        length.ifPresent(l -> System.out.println("Length: " + l));
    }
}