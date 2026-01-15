import java.util.*;

public class Solution {

    public static List<Integer> traverseBoundary(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        // Add root
        res.add(root.data);

        // Add left boundary (excluding leaf)
        addLeftBoundary(root.left, res);

        // Add all leaf nodes
        addLeaves(root.left, res);
        addLeaves(root.right, res);

        // Add right boundary (excluding leaf, in reverse)
        addRightBoundary(root.right, res);

        return res;
    }

    // Left boundary (excluding leaf nodes)
    private static void addLeftBoundary(TreeNode node, List<Integer> res){
        while(node != null){
            if(!isLeaf(node)) res.add(node.data);
            if(node.left != null) node = node.left;
            else node = node.right;
        }
    }

    // Right boundary (excluding leaf nodes, added in reverse)
    private static void addRightBoundary(TreeNode node, List<Integer> res){
        Stack<Integer> st = new Stack<>();

        while(node != null){
            if(!isLeaf(node)) st.push(node.data);
            if(node.right != null) node = node.right;
            else node = node.left;
        }

        while(!st.isEmpty()){
            res.add(st.pop());
        }
    }

    // Add all leaf nodes (left to right)
    private static void addLeaves(TreeNode node, List<Integer> res){
        if(node == null) return;

        if(isLeaf(node)){
            res.add(node.data);
            return;
        }

        addLeaves(node.left, res);
        addLeaves(node.right, res);
    }

    private static boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
}
