// tabulation

import java.util.*;

class Solution {
    // Function to solve unbounded knapsack using tabulation
    public int unboundedKnapsack(int n, int W, int[] val, int[] wt) {
        // Create DP table where dp[i][j] stores max value for i items and capacity j
        int[][] dp = new int[n][W + 1];

        // Base condition: fill first row using infinite supply of first item
        for (int i = wt[0]; i <= W; i++) {
            dp[0][i] = (i / wt[0]) * val[0];
        }

        // Loop through remaining items
        for (int ind = 1; ind < n; ind++) {
            // Loop through all capacities
            for (int cap = 0; cap <= W; cap++) {
                // Case 1: Not take current item
                int notTaken = dp[ind - 1][cap];

                // Case 2: Take current item
                int taken = Integer.MIN_VALUE;
                if (wt[ind] <= cap) {
                    taken = val[ind] + dp[ind][cap - wt[ind]];
                }

                // Store the best value
                dp[ind][cap] = Math.max(notTaken, taken);
            }
        }

        // Return result
        return dp[n - 1][W];
    }
}

// Driver class
public class unboundedKnap_12 {
    public static void main(String[] args) {
        int[] wt = {2, 4, 6};
        int[] val = {5, 11, 13};
        int W = 10;
        int n = wt.length;

        Solution obj = new Solution();
        System.out.println("The Maximum value of items the thief can steal is " 
                           + obj.unboundedKnapsack(n, W, val, wt));
    }
}
