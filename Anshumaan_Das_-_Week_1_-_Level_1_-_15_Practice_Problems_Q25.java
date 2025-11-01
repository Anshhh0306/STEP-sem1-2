public class Q25_15 {
    static long[] memo = new long[21];
    public static void main(String[] args) {
        System.out.println(factorial(20));
    }
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        if (memo[n] != 0) return memo[n];
        return memo[n] = n * factorial(n - 1);
    }
}