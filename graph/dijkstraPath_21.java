// diskstra algo to print path

import java.util.*;

public class dijkstraPath_21 {

    public static void dijkstra(int V, ArrayList<int[]>[] adj, int src, int dest) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int[] dist = new int[V];
        int[] parent = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        for (int i = 0; i < V; i++) parent[i] = i;

        dist[src] = 0;
        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0];
            int node = cur[1];

            for (int[] edge : adj[node]) {
                int adjNode = edge[0];
                int wt = edge[1];

                if (d + wt < dist[adjNode]) {
                    dist[adjNode] = d + wt;
                    parent[adjNode] = node;
                    pq.offer(new int[]{dist[adjNode], adjNode});
                }
            }
        }

        // Print distance
        System.out.println("Shortest distance from " + src + " to " + dest + " = " + dist[dest]);

        // Print path
        List<Integer> path = new ArrayList<>();
        int node = dest;

        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(src);

        Collections.reverse(path);

        System.out.println("Shortest path: " + path);
    }

    public static void main(String[] args) {

        int V = 5;
        int src = 0;
        int dest = 4;

        ArrayList<int[]>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new ArrayList<>();

        // Graph
        adj[0].add(new int[]{1, 2});
        adj[0].add(new int[]{2, 4});
        adj[1].add(new int[]{2, 1});
        adj[1].add(new int[]{3, 7});
        adj[2].add(new int[]{4, 3});
        adj[3].add(new int[]{4, 1});

        dijkstra(V, adj, src, dest);
    }
}
