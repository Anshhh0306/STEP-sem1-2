public class W2L2Q2 {
    public static void main(String[] args) {
        double salary = 50000;
        double years = 6;
        double bonus = years > 5 ? salary * 0.05 : salary * 0.02;
        System.out.println("Bonus: " + bonus);
    }
}