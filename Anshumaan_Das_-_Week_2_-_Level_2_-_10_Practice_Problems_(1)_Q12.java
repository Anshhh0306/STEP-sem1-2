public class W2L2Q12 {
    public static void main(String[] args) {
        int number = 12345;
        int largest = 0, secondLargest = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            number /= 10;
        }
        System.out.println("Largest: " + largest + ", Second: " + secondLargest);
    }
}