// connected components bfs , dfs using adjacency lists
// Time: O(V + E)
// Space: O(V + E) (or O(V) auxiliary)

import java.util.*;

public class connectedComponents {

    // public static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {
    //     boolean[] vis = new boolean[V];
    //     int count = 0;

    //     for (int i = 0; i < V; i++) {
    //         if (!vis[i]) {
    //             dfs(i, adj, vis);
    //             count++; // one component found
    //         }
    //     }
    //     return count;
    // }

    private static void bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nei : adj.get(node)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis);
            }
        }
    }
}
