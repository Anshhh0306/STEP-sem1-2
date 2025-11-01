import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SimpleDB {
    private Map<String, String> db = new HashMap<>();

    public void put(String key, String value) {
        db.put(key, value);
    }

    public String get(String key) {
        return db.get(key);
    }

    public void remove(String key) {
        db.remove(key);
    }

    public void display() {
        for (Map.Entry<String, String> entry : db.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

public class W2L3Q47 {
    public static void main(String[] args) {
        SimpleDB db = new SimpleDB();
        Scanner scanner = new Scanner(System.in);
        System.out.println("DB: put <key> <value>, get <key>, remove <key>, display, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "put":
                    String key = scanner.next();
                    String value = scanner.next();
                    db.put(key, value);
                    break;
                case "get":
                    String gkey = scanner.next();
                    System.out.println("Value: " + db.get(gkey));
                    break;
                case "remove":
                    String rkey = scanner.next();
                    db.remove(rkey);
                    break;
                case "display":
                    db.display();
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}