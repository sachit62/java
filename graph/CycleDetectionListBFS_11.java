import java.util.*;

public class CycleDetectionListBFS_11 {

    static class Pair {
        int node, parent;
        Pair(int n, int p) {
            node = n;
            parent = p;
        }
    }

    public static boolean hasCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfs(i, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, -1));
        vis[start] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int node = cur.node;
            int parent = cur.parent;

            for (int nei : adj.get(node)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.add(new Pair(nei, node));
                } else if (nei != parent) {
                    // visited and not parent → cycle
                    return true;
                }
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

        System.out.println("Cycle present (BFS): " + hasCycle(V, adj));
    }
}
