public class W2L2Q53 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        int[] freq = new int[10];
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + ": " + freq[i]);
            }
        }
    }
}