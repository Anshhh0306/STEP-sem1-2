public class Q20_15 {
    public static void main(String[] args) {
        int month = 10, day = 8;
        if ((month == 3 && day >= 21) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("Spring");
        } else if ((month == 6 && day >= 21) || (month == 7) || (month == 8) || (month == 9 && day <= 22)) {
            System.out.println("Summer");
        } else if ((month == 9 && day >= 23) || (month == 10) || (month == 11) || (month == 12 && day <= 20)) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }
}