import java.util.*;

public class CycleDetectionMatrixDFS_9 {

    public static boolean hasCycle(int V, int[][] graph) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, graph, vis, V)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, int[][] graph, boolean[] vis, int V) {
        vis[node] = true;

        for (int j = 0; j < V; j++) {
            if (graph[node][j] == 1) {
                if (!vis[j]) {
                    if (dfs(j, node, graph, vis, V)) {
                        return true;
                    }
                } else if (j != parent) {
                    // visited and not parent → cycle
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 0}
        };

        System.out.println("Cycle present (DFS): " + hasCycle(V, graph));
    }
}
