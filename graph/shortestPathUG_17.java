// shortest path in undirected graph with unit weights

import java.util.*;

class Solution{

    // Function to compute shortest path using BFS
    public int[] shortestPath(int[][] edges, int N, int M, int src) {

        // Create adjacency list for undirected graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }

        // Fill adjacency list from edge list
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        // Initialize distance array with large value (infinity)
        int[] dist = new int[N];
        Arrays.fill(dist, (int) 1e9);

        // Set source distance to 0
        dist[src] = 0;

        // Initialize queue for BFS
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        // BFS traversal
        while (!q.isEmpty()) {
            int node = q.poll();

            // Traverse neighbors
            for (int neighbor : adj.get(node)) {
                if (dist[node] + 1 < dist[neighbor]) {
                    dist[neighbor] = dist[node] + 1;
                    q.add(neighbor);
                }
            }
        }

        // Prepare result, replacing infinity with -1
        for (int i = 0; i < N; i++) {
            if (dist[i] == (int) 1e9) {
                dist[i] = -1;
            }
        }

        return dist;
    }
}

// Driver code
public class shortestPathUG_17 {
    public static void main(String[] args) {

        int N = 9, M = 10;
        int[][] edges = {
            {0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6},
            {1, 2}, {2, 6}, {6, 7}, {7, 8}, {6, 8}
        };

        Solution obj = new Solution();
        int[] result = obj.shortestPath(edges, N, M, 0);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}


