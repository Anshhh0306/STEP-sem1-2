import java.util.Arrays;
import java.util.Collections;

public class W2L2Q40 {
    public static void main(String[] args) {
        Integer[] arr = {3, 1, 4, 1, 5};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}