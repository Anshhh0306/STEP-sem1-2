import java.util.Arrays;

public class Q18_15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}