import java.util.*;

public class heightOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int lcount = count(root.left);
        int rcount = count(root.right);
        return lcount + rcount + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        int lsum = sum(root.left);
        int rsum = sum(root.right);
        return lsum + rsum + (root.data);
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDia = diameter(root.left);
        int leftHt = height(root.left);
        int rightDia = diameter(root.right);
        int rightHt = height(root.right);

        int selfDia = leftHt + rightHt + 1;

        return Math.max(selfDia, Math.max(leftDia, rightDia));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) {
        if (root == null) {
            return new Info(0, 0); // Base case: diameter = 0, height = 0
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ \
         * 4 5 6
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println(height(root));

        System.out.println(count(root));

        System.out.println(sum(root));

        System.out.println(diameter(root));

        System.out.println(diameter2(root).diam);
    }
}
