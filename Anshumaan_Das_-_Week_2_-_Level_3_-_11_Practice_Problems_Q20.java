import java.util.Scanner;
import java.util.Stack;

public class W2L3Q20 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stack operations: push <num>, pop, peek, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "push":
                    int num = scanner.nextInt();
                    stack.push(num);
                    System.out.println("Pushed: " + num);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case "peek":
                    if (!stack.isEmpty()) {
                        System.out.println("Top: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
        System.out.println("Final stack: " + stack);
    }
}