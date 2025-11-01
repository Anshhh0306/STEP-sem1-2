import java.io.*;
import java.util.*;

public class W2L3Q13 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("numbers.txt"))) {
            List<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            if (numbers.isEmpty()) {
                System.out.println("No numbers in file.");
                return;
            }
            int sum = numbers.stream().mapToInt(Integer::intValue).sum();
            double average = (double) sum / numbers.size();
            int max = Collections.max(numbers);
            int min = Collections.min(numbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Creating sample file.");
            createSampleFile();
        }
    }

    private static void createSampleFile() {
        try (PrintWriter writer = new PrintWriter("numbers.txt")) {
            for (int i = 1; i <= 10; i++) {
                writer.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}