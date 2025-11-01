import java.util.*;

public class W2L3Q22 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Queue operations: enqueue <num>, dequeue, front, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "enqueue":
                    int num = scanner.nextInt();
                    queue.add(num);
                    System.out.println("Enqueued: " + num);
                    break;
                case "dequeue":
                    if (!queue.isEmpty()) {
                        System.out.println("Dequeued: " + queue.poll());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        System.out.println("Front: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        System.out.println("Final queue: " + queue);
    }
}