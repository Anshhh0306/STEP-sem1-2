public class Q8_15 {
    static class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println("Inorder: ");
        inorder(root);
    }
    static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
}