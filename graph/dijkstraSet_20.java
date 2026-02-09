// TC : E LOG V

import java.util.*;

// Dijkstra using Set (TreeSet)
public class dijkstraSet_20 {

    public static int[] dijkstra(int V, ArrayList<int[]>[] adj, int S) {

        TreeSet<int[]> set = new TreeSet<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[S] = 0;
        set.add(new int[]{0, S});

        while (!set.isEmpty()) {
            int[] cur = set.pollFirst();
            int dis = cur[0];
            int node = cur[1];

            for (int[] edge : adj[node]) {
                int adjNode = edge[0];
                int weight = edge[1];

                if (dis + weight < dist[adjNode]) {

                    if (dist[adjNode] != Integer.MAX_VALUE) {
                        set.remove(new int[]{dist[adjNode], adjNode});
                    }

                    dist[adjNode] = dis + weight;
                    set.add(new int[]{dist[adjNode], adjNode});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {

        int V = 5, S = 0;

        ArrayList<int[]>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();

        adj[0].add(new int[]{1, 2});
        adj[0].add(new int[]{2, 4});
        adj[1].add(new int[]{2, 1});
        adj[1].add(new int[]{3, 7});
        adj[2].add(new int[]{4, 3});
        adj[3].add(new int[]{4, 1});

        int[] dist = dijkstra(V, adj, S);

        System.out.println("Dijkstra using Set:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " -> Distance = " + dist[i]);
        }
    }
}
