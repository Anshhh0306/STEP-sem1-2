import java.util.*;

public class W2L3Q29 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Max heap
        Scanner scanner = new Scanner(System.in);
        System.out.println("Priority Queue: add <num>, poll, peek, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "add":
                    int num = scanner.nextInt();
                    pq.add(num);
                    System.out.println("Added: " + num);
                    break;
                case "poll":
                    if (!pq.isEmpty()) {
                        System.out.println("Polled: " + pq.poll());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case "peek":
                    if (!pq.isEmpty()) {
                        System.out.println("Peek: " + pq.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        System.out.println("Final queue: " + pq);
    }
}