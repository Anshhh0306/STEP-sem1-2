import java.util.PriorityQueue;

public class W2L2Q9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}