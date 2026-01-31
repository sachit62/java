import java.util.*;

public class ConnectedComponentsMatrix_6 {

    public static int countComponents(int V, int[][] graph) {
        boolean[] vis = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, graph, vis, V);
                // bfs(i, graph, vis, V); // you can use BFS instead of DFS
                count++;
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

    public static void main(String[] args) {
        int V = 5;

        // Adjacency Matrix
        int[][] graph = {
                {0, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}
        };

        int components = countComponents(V, graph);
        System.out.println("Connected Components (Matrix): " + components);
    }
}

