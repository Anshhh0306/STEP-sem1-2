public class W2L3Q30 {
    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        W2L3Q30 calc = new W2L3Q30();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2.5 + 3.5 = " + calc.add(2.5, 3.5));
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3));
    }
}