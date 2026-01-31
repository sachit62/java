import java.util.*;

public class ConnectedComponentsList_7 {

    public static int countComponents(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
                // bfs(i, adj, vis); // you can use BFS instead of DFS
                count++;
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        for (int nei : adj.get(node)) {
            if (!vis[nei]) {
                dfs(nei, adj, vis);
            }
        }
    }

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

    public static void main(String[] args) {
        int V = 5;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(2).add(3);
        adj.get(3).add(2);

        // node 4 is isolated

        int components = countComponents(V, adj);
        System.out.println("Connected Components (List): " + components);
    }
}
