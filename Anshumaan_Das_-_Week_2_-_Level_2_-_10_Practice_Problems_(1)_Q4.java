public class W2L2Q4 {
    public static void main(String[] args) {
        double[] arr = {10, 20, 30};
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        System.out.println("Average: " + (sum / arr.length));
    }
}