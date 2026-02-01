import java.util.*;

public class CycleDetectionDirectedMatrixDFS_13 {

    // Check if graph contains a cycle
    // Time Complexity: O(V^2)
    // Space Complexity: O(V)
    public static boolean hasCycle(int V, int[][] graph) {
        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];

        // Check each vertex (for disconnected components)
        // Time Complexity: O(V)
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, graph, vis, pathVis, V)) {
                    return true;
                }
            }
        }
        return false;
    }

    // DFS helper function
    // Time Complexity: O(V) for one DFS call (scan full row of matrix)
    // Space Complexity: O(V) (recursion stack)
    private static boolean dfs(int node, int[][] graph,
                               boolean[] vis, boolean[] pathVis, int V) {

        vis[node] = true;
        pathVis[node] = true;

        // Check all possible neighbors
        for (int nei = 0; nei < V; nei++) {
            if (graph[node][nei] == 1) { // edge exists
                // If not visited, recurse
                if (!vis[nei]) {
                    if (dfs(nei, graph, vis, pathVis, V)) return true;
                }
                // If neighbor is in current DFS path → cycle
                else if (pathVis[nei]) {
                    return true;
                }
            }
        }

        pathVis[node] = false; // backtrack
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        // Adjacency Matrix
        int[][] graph = new int[V][V];

        // Add directed edges
        // Graph: 0 → 1 → 2 → 0 (cycle)
        //        2 → 3
        graph[0][1] = 1;
        graph[1][2] = 1;
        graph[2][0] = 1;
        graph[2][3] = 1;

        System.out.println("Cycle present (Directed DFS - Matrix): " + hasCycle(V, graph));

        // Overall Time: O(V^2)
        // Overall Space: O(V)
    }
}
