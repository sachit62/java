// space optimisation
// Time Complexity: O(N*K),There are three nested loops
// Space Complexity: O(K),We are using an external array of size ‘K+1’ to store only one row.

import java.util.Arrays;

class Solution {
    // Function to check if subset with sum k exists using space optimized DP
    public boolean subsetSumToK(int n, int k, int[] arr) {
        // Initialize previous row of DP table with false
        boolean[] prev = new boolean[k + 1];

        // Base case: sum 0 can always be formed with empty subset
        prev[0] = true;

        // Base case: if first element <= k, mark true
        if (arr[0] <= k) {
            prev[arr[0]] = true;
        }

        // Iterate over elements starting from second
        for (int ind = 1; ind < n; ind++) {
            // Current row of DP table
            boolean[] cur = new boolean[k + 1];
            cur[0] = true; // sum 0 always possible

            for (int target = 1; target <= k; target++) {
                // Option 1: not take current element
                boolean notTaken = prev[target];

                // Option 2: take current element if possible
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = prev[target - arr[ind]];
                }

                // Store true if either option is true
                cur[target] = notTaken || taken;
            }
            // Move current row to previous for next iteration
            prev = cur;
        }

        // Return if sum k is possible using all elements
        return prev[k];
    }
}

public class subsetSumK_7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 4;
        Solution sol = new Solution();

        if (sol.subsetSumToK(arr.length, k, arr)) {
            System.out.println("Subset with the given target found");
        } else {
            System.out.println("Subset with the given target not found");
        }
    }
}
