// Time Complexity: O(V^3), where V is the number of vertices in the graph. This is because we have three nested loops iterating over the vertices.
// Space Complexity: O(V^2), where V is the number of vertices in the graph. This is due to the storage of the distance matrix, which is of size V x V.

import java.util.Arrays;

class Solution {
    /* Function to find the shortest distance 
       between every pair of vertices. */
    public void shortest_distance(int[][] matrix) {
        
        // Getting the number of nodes
        int n = matrix.length;
        
        // For each intermediate node k
        for (int k = 0; k < n; k++) {
            
            // Check for every (i, j) pair of nodes
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    
                    /* If k is not an intermediate 
                       node, skip the iteration */
                    if (matrix[i][k] == -1 || matrix[k][j] == -1)
                        continue;
                    
                    /* If no direct edge from 
                       i to j is present */
                    if (matrix[i][j] == -1) {
                        // Update the distance
                        matrix[i][j] = matrix[i][k] + matrix[k][j];
                    }
                    /* Else update the distance to 
                       minimum of both paths */
                    else {
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
    }
}

// Separate Main class for running the program
public class floydWarshall_23 {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 2, -1, -1},
            {1, 0, 3, -1},
            {-1, -1, 0, -1},
            {3, 5, 4, 0}
        };
        
        // Create instance of Solution class
        Solution sol = new Solution();
        
        // Find shortest distances
        sol.shortest_distance(matrix);
        
        // Output the shortest distance matrix
        int n = matrix.length;
        System.out.println("The shortest distance matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

