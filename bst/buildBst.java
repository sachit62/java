public class buildBst {

    // Inner static class representing each Node of the BST
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to insert a new node into the BST
    public static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // In-order traversal of the BST
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Main method to test BST insertion and traversal
    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int value : values) {
            root = insert(root, value);
        }

        inorder(root);  // Should print: 1 2 3 4 5 7
        System.out.println();
    }
}
