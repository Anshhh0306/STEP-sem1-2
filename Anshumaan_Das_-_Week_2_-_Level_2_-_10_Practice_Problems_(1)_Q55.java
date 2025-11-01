public class W2L2Q55 {
    public static void main(String[] args) {
        int[] frequency = {0, 1, 2, 1};
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}