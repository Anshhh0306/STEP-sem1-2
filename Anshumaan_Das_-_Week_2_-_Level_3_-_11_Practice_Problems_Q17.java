import java.util.*;

public class W2L3Q17 {
    public static void main(String[] args) {
        Map<String, Integer> hashTable = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter key-value pairs (key value), 'exit' to stop:");
        while (true) {
            String input = scanner.nextLine();
            if ("exit".equals(input)) break;
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                hashTable.put(parts[0], Integer.parseInt(parts[1]));
            }
        }
        System.out.println("HashTable contents:");
        for (Map.Entry<String, Integer> entry : hashTable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.print("Enter key to search: ");
        String key = scanner.next();
        System.out.println("Value: " + hashTable.getOrDefault(key, -1));
    }
}