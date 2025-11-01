import java.util.concurrent.*;

public class Q16_15 {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println(map);
    }
}