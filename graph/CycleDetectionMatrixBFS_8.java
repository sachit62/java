import java.util.*;

public class CycleDetectionMatrixBFS_8 {

    static class Pair {
        int node, parent;
        Pair(int n, int p) {
            node = n;
            parent = p;
        }
    }

    public static boolean hasCycle(int V, int[][] graph) {
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (bfs(i, graph, vis, V)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean bfs(int start, int[][] graph, boolean[] vis, int V) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, -1));
        vis[start] = true;

        while (!q.isEmpty()) {
            Pair cur = q.poll();
            int node = cur.node;
            int parent = cur.parent;

            for (int j = 0; j < V; j++) {
                if (graph[node][j] == 1) {
                    if (!vis[j]) {
                        vis[j] = true;
                        q.add(new Pair(j, node));
                    } else if (j != parent) {
                        // visited and not parent → cycle
                        return true;
                    }
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

        System.out.println("Cycle present (BFS): " + hasCycle(V, graph));
    }
}

