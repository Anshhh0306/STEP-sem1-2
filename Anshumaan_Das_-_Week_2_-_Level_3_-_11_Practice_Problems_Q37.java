import java.util.*;

public class W2L3Q37 {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Min Heap: add <num>, poll, peek, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "add":
                    int num = scanner.nextInt();
                    minHeap.add(num);
                    System.out.println("Added: " + num);
                    break;
                case "poll":
                    if (!minHeap.isEmpty()) {
                        System.out.println("Polled: " + minHeap.poll());
                    } else {
                        System.out.println("Heap is empty.");
                    }
                    break;
                case "peek":
                    if (!minHeap.isEmpty()) {
                        System.out.println("Peek: " + minHeap.peek());
                    } else {
                        System.out.println("Heap is empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        System.out.println("Final heap: " + minHeap);
    }
}