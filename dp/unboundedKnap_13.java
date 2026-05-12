import java.util.*;

// Solution class containing the unbounded knapsack logic
class Solution {
    // Function to solve Unbounded Knapsack using space optimization
    public int unboundedKnapsack(int n, int W, int[] val, int[] wt) {
        // cur[cap] will store max value for capacity = cap
        int[] cur = new int[W + 1];

        // Base case: Fill for first item
        for (int i = wt[0]; i <= W; i++) {
            cur[i] = (i / wt[0]) * val[0];
        }

        // Process remaining items
        for (int ind = 1; ind < n; ind++) {
            for (int cap = 0; cap <= W; cap++) {
                // Option 1: Do not take current item
                int notTaken = cur[cap];

                // Option 2: Take current item (if fits)
                int taken = Integer.MIN_VALUE;
                if (wt[ind] <= cap) {
                    taken = val[ind] + cur[cap - wt[ind]];
                }

                // Choose max of two options
                cur[cap] = Math.max(notTaken, taken);
            }
        }

        // Final result for capacity W
        return cur[W];
    }
}

// Driver class with main method
public class unboundedKnap_13 {
    public static void main(String[] args) {
        int[] wt = { 2, 4, 6 }; // Weights
        int[] val = { 5, 11, 13 }; // Values
        int W = 10; // Capacity
        int n = wt.length;

        Solution obj = new Solution();
        System.out.println("The Maximum value of items the thief can steal is " +
                obj.unboundedKnapsack(n, W, val, wt));
    }
}
