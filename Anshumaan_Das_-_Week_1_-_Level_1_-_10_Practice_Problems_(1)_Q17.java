public class Q17 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("Hello from thread");
        });
        t.start();
    }
}