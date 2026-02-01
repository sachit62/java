import java.util.*;

public class CycleDetectionDirectedListDFS_12 {

    // Check if graph contains a cycle
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)
    public static boolean hasCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];      // visited array
        boolean[] pathVis = new boolean[V]; // recursion stack

        // Check each component
        // Time Complexity: O(V)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, adj, vis, pathVis)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper function
    // Time Complexity: O(V + E)
    // Space Complexity: O(V) (recursion stack)
    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj,
                               boolean[] vis, boolean[] pathVis) {

        vis[node] = true;
        pathVis[node] = true; // mark in current DFS path

        // Traverse all neighbors
        for (int nei : adj.get(node)) {
            // If not visited, recurse
            if (!vis[nei]) {
                if (dfs(nei, adj, vis, pathVis)) return true;
            }
            // If neighbor is in current path → cycle
            else if (pathVis[nei]) {
                return true;
            }
        }

        pathVis[node] = false; // remove from path when backtracking
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add directed edges
        // Graph: 0 → 1 → 2 → 0 (cycle)
        //        2 → 3
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);

        System.out.println("Cycle present (Directed DFS - List): " + hasCycle(V, adj));

        // Overall Time: O(V + E)
        // Overall Space: O(V + E)
    }
}
