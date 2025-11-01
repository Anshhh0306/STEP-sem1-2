import java.util.Arrays;
import java.util.Comparator;

public class Q38 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 4, 1, 5};
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}