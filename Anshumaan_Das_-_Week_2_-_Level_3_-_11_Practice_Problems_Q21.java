import java.util.*;
import java.util.function.*;

public class W2L3Q21 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Lambda for even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Lambda for square
        Function<Integer, Integer> square = n -> n * n;
        List<Integer> squares = numbers.stream()
                .map(square)
                .collect(Collectors.toList());
        System.out.println("Squares: " + squares);

        // Lambda for sum
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        int total = numbers.stream()
                .reduce(0, sum);
        System.out.println("Sum: " + total);

        // Consumer to print
        Consumer<Integer> print = n -> System.out.print(n + " ");
        System.out.print("All numbers: ");
        numbers.forEach(print);
        System.out.println();
    }
}