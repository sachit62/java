import java.util.*;

public class CycleDetectionListDFS_10 {

    public static boolean hasCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;

        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                if (dfs(nei, node, adj, vis)) {
                    return true;
                }
            } else if (nei != parent) {
                // visited and not parent → cycle
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Undirected edges
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(0);
        adj.get(0).add(2);

        // node 3 isolated

        System.out.println("Cycle present (DFS): " + hasCycle(V, adj));
    }
}
