public class W2L2Q28 {
    public static void main(String[] args) {
        int number = 123;
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed: " + reversed);
    }
}