public class Q24_15 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Done");
        });
        t.start();
    }
}