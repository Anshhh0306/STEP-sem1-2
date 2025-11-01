public class W2L2Q54 {
    public static void main(String[] args) {
        int[] frequency = {0, 1, 2, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}