import java.util.*;

public class TopoSortDFSList_14 {

    // Function to perform Topological Sort
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)
    public static List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();

        // Call DFS for each unvisited node
        // Time Complexity: O(V)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis, st);
            }
        }

        // Pop elements from stack to get topological order
        List<Integer> topo = new ArrayList<>();
        while (!st.isEmpty()) {
            topo.add(st.pop());
        }

        return topo;
    }

    // DFS helper function
    // Time Complexity: O(V + E)
    // Space Complexity: O(V) (recursion stack)
    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj,
                            boolean[] vis, Stack<Integer> st) {

        vis[node] = true;

        // Traverse all neighbors
        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis, st);
            }
        }

        // Push node after visiting all neighbors (post-order)
        st.push(node);
    }

    public static void main(String[] args) {
        int V = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add directed edges
        // Graph:
        // 5 → 2 → 3 → 1
        // 5 → 0
        // 4 → 0
        // 4 → 1
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        List<Integer> topoOrder = topoSort(V, adj);

        System.out.println("Topological Sort (DFS): " + topoOrder);

        // Overall Time: O(V + E)
        // Overall Space: O(V + E)
    }
}
