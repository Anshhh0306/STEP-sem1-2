public class Q21_15 {
    public static void main(String[] args) {
        int month = 4, day = 15;
        boolean isSpring = (month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20);
        if (isSpring) {
            System.out.println("Spring");
        } else {
            System.out.println("Not Spring");
        }
    }
}