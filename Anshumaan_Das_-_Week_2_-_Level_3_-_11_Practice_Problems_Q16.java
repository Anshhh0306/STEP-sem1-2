import java.util.*;
import java.util.stream.*;

public class W2L3Q16 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        System.out.println("Original: " + words);

        // Filter words longer than 5 characters
        List<String> longWords = words.stream()
                .filter(w -> w.length() > 5)
                .collect(Collectors.toList());
        System.out.println("Long words: " + longWords);

        // Convert to uppercase
        List<String> upperWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase: " + upperWords);

        // Count words starting with 'a'
        long countA = words.stream()
                .filter(w -> w.startsWith("a"))
                .count();
        System.out.println("Words starting with 'a': " + countA);

        // Sort by length
        List<String> sortedByLength = words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println("Sorted by length: " + sortedByLength);
    }
}