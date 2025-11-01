import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class W2L3Q24 {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        W2L3Q24 list = new W2L3Q24();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linked List: insert <num>, delete <num>, display, exit");
        while (true) {
            String command = scanner.next();
            if ("exit".equals(command)) break;
            switch (command) {
                case "insert":
                    int num = scanner.nextInt();
                    list.insert(num);
                    break;
                case "delete":
                    int key = scanner.nextInt();
                    list.delete(key);
                    break;
                case "display":
                    list.display();
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}