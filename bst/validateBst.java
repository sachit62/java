public class validateBst {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Recursive function to validate BST
    public static boolean isValidBst(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);
    }

    public static void main(String[] args) {
        // Constructing a valid BST
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);

        if (isValidBst(root, null, null)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
