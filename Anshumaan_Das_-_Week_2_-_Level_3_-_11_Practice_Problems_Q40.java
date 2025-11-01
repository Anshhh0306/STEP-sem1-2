public class W2L3Q40 {
    // Varargs method
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1,2,3: " + sum(1, 2, 3));
        System.out.println("Sum of 5,10,15,20: " + sum(5, 10, 15, 20));
        System.out.println("Sum of nothing: " + sum());
    }
}