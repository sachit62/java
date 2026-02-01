import java.util.*;

public class CycleDetectionDirectedBFSList_16 {

    // Function to detect cycle in a directed graph using BFS (Kahn's Algorithm)
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)
    public static boolean hasCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V]; // store indegree of each vertex

        // Step 1: Calculate indegree of all vertices
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

        // Step 3: BFS (Topological Sort process)
        int count = 0; // count of nodes processed

        // Time Complexity: O(V + E)
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            // Reduce indegree of neighbors
            for (int nei : adj.get(node)) {
                indegree[nei]--;
                if (indegree[nei] == 0) {
                    q.add(nei);
                }
            }
        }

        // Step 4: If processed nodes < V → cycle exists
        return count != V;
    }

    public static void main(String[] args) {
        int V = 4;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Add directed edges
        // Graph: 0 → 1 → 2 → 0 (cycle present)
        //        2 → 3
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);

        System.out.println("Cycle present (Directed BFS): " + hasCycle(V, adj));

        // Overall Time Complexity: O(V + E)
        // Overall Space Complexity: O(V + E)
    }
}

