public class W2L3Q46 {
    public static void main(String[] args) {
        int x = 10;
        assert x > 5 : "x should be greater than 5";
        System.out.println("Assertion passed: x = " + x);

        int y = 0;
        assert y != 0 : "y should not be zero";
        int result = 10 / y; // This will throw exception if assertion fails, but in practice assertions are for debugging
        System.out.println("Result: " + result);
    }
}