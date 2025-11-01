import java.util.HashMap;

public class Q9_15 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}