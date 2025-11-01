public class W2L2Q50 {
    public static void main(String[] args) {
        int[] marks = {80, 90, 70};
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double percentage = total / 3.0;
        System.out.println("Total: " + total + ", Percentage: " + percentage);
    }
}