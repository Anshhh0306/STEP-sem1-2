class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class W2L3Q42 {
    TreeNode root;

    void insert(int val) {
        root = insertRec(root, val);
    }

    TreeNode insertRec(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        if (val < root.val)
            root.left = insertRec(root.left, val);
        else
            root.right = insertRec(root.right, val);
        return root;
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        W2L3Q42 tree = new W2L3Q42();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        System.out.print("Inorder: ");
        tree.inorder(tree.root);
    }
}