import java.util.*;

public class W2L3Q41 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set operations: add <item>, remove <item>, contains <item>, display, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "add":
                    String item = scanner.next();
                    set.add(item);
                    System.out.println("Added: " + item);
                    break;
                case "remove":
                    String rem = scanner.next();
                    if (set.remove(rem)) {
                        System.out.println("Removed: " + rem);
                    } else {
                        System.out.println("Not found: " + rem);
                    }
                    break;
                case "contains":
                    String check = scanner.next();
                    System.out.println("Contains: " + set.contains(check));
                    break;
                case "display":
                    System.out.println("Set: " + set);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}