import java.util.*;

public class TopoSortBFSList_15 {

    // Function to perform Topological Sort using BFS (Kahn's Algorithm)
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)
    public static List<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V]; // stores indegree of each vertex

        // Step 1: Calculate indegree of each vertex
        // Time Complexity: O(V + E)
        for (int i = 0; i < V; i++) {
            for (int nei : adj.get(i)) {
                indegree[nei]++;
            }
        }

        // Step 2: Push all vertices with indegree 0 into queue
        Queue<Integer> q = new LinkedList<>();
        // Time Complexity: O(V)
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 3: BFS
        List<Integer> topo = new ArrayList<>();
        // Time Complexity: O(V + E)
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            // Reduce indegree of neighbors
            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        return topo;
    }

    public static void main(String[] args) {
        int V = 6;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add directed edges
        // Graph:
        // 5 → 2 → 3 → 1
        // 5 → 0
        // 4 → 0
        // 4 → 1
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        List<Integer> topoOrder = topoSort(V, adj);

        System.out.println("Topological Sort (BFS): " + topoOrder);

        // Overall Time Complexity: O(V + E)
        // Overall Space Complexity: O(V + E)
    }
}
