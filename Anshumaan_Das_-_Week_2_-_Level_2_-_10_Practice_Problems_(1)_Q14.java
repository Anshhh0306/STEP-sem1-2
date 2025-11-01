import java.util.concurrent.atomic.AtomicInteger;

public class W2L2Q14 {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(0);
        ai.incrementAndGet();
        System.out.println(ai.get());
    }
}