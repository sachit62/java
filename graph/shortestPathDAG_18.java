// Importing required classes
import java.util.*;

// Class containing method to find shortest path using Topo Sort (DAG)
class Solution {

    // Function to perform DFS and build Topological Order
    private void topoSort(int node, List<List<int[]>> adj, boolean[] visited, Stack<Integer> stack) {
        
        // Mark the current node as visited
        visited[node] = true;
        
        // Traverse all adjacent nodes
        for (int[] neighbor : adj.get(node)) {
            
            // If the neighbor hasn't been visited, recurse
            if (!visited[neighbor[0]]) {
                topoSort(neighbor[0], adj, visited, stack);
            }
        }
        
        // After visiting all neighbors, push this node into the stack
        stack.push(node);
    }

    // Function to compute shortest path from source node (0) in a DAG
    public int[] shortestPath(int N, int M, int[][] edges) {
        
        // Create adjacency list for graph with weights
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Fill the adjacency list from edge list
        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new int[]{v, wt});
        }

        // Initialize visited array for topo sort
        boolean[] visited = new boolean[N];
        
        // Stack to hold topological order
        Stack<Integer> stack = new Stack<>();
        
        // Perform topo sort from unvisited nodes
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                topoSort(i, adj, visited, stack);
            }
        }

        // Initialize distance array with infinity (represented by large value)
        int[] dist = new int[N];
        Arrays.fill(dist, (int)1e9);

        // Distance to source (0) is 0
        dist[0] = 0;

        // Process nodes in topological order
        while (!stack.isEmpty()) {
            int node = stack.pop();
            
            // If the node is reachable
            if (dist[node] != (int)1e9) {
                
                // Traverse all neighbors and update their distances
                for (int[] neighbor : adj.get(node)) {
                    int v = neighbor[0];
                    int wt = neighbor[1];
                    
                    // Relax the edge
                    if (dist[node] + wt < dist[v]) {
                        dist[v] = dist[node] + wt;
                    }
                }
            }
        }

        // Replace all unreachable nodes with -1
        for (int i = 0; i < N; i++) {
            if (dist[i] == (int)1e9) {
                dist[i] = -1;
            }
        }

        // Return the final distance array
        return dist;
    }
}

// Driver class to run the solution
public class shortestPathDAG_18 {
    public static void main(String[] args) {
        
        // Number of nodes and edges
        int N = 6, M = 7;
        
        // Edge list with weights
        int[][] edges = {
            {0,1,2}, {0,4,1}, {4,5,4},
            {4,2,2}, {1,2,3}, {2,3,6}, {5,3,1}
        };

        // Create object of Solution class
        Solution obj = new Solution();
        
        // Get shortest path from source (0)
        int[] result = obj.shortestPath(N, M, edges);

        // Print the shortest distances
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
    
