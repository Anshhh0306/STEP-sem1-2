public class W2L2Q5 {
    public static void main(String[] args) {
        double[] arr = {1, 5, 3};
        double max = arr[0];
        for (double d : arr) {
            if (d > max) max = d;
        }
        System.out.println("Max: " + max);
    }
}