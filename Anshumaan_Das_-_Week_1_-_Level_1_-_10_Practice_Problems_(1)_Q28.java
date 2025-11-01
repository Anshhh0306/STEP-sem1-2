public class Q28 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}