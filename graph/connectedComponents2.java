// connected components bfs , dfs using adjacency matrix (used rarely when n is small)
// Time : O(V^2)
// Space : O(V²) (or O(V) auxiliary)

import java.util.*;

public class connectedComponents2 {

    public static int countComponents(int V, int[][] graph) {
        boolean[] vis = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, graph, vis, V);
                count++; // one connected component found
            }
        }
        return count;
    }

    private static void dfs(int node, int[][] graph, boolean[] vis, int V) {
        vis[node] = true;

        for (int j = 0; j < V; j++) {
            if (graph[node][j] == 1 && !vis[j]) {
                dfs(j, graph, vis, V);
            }
        }
    }

    private static void bfs(int start, int[][] graph, boolean[] vis, int V) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int j = 0; j < V; j++) {
                if (graph[node][j] == 1 && !vis[j]) {
                    vis[j] = true;
                    q.add(j);
                }
            }
        }
    }
}
