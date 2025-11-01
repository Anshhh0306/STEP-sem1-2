public class W2L2Q52 {
    public static void main(String[] args) {
        int number = 12233;
        int[] frequency = new int[10];
        while (number > 0) {
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}