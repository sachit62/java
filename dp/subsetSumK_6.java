// tabulation
// Time Complexity: O(N*K),There are two nested loops
// Space Complexity: O(N*K), We are using an external array of size ‘N*K’. Stack Space is eliminated.

import java.util.Arrays;

class Solution {
    // Function to check if subset with sum k exists in arr
    public boolean subsetSumToK(int n, int k, int[] arr) {
        // Create DP table with n rows and k+1 columns, default false
        boolean[][] dp = new boolean[n][k + 1];

        // Base case: sum=0 can always be formed by empty subset
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Base case: If first element <= k, mark dp[0][arr[0]] true
        if (arr[0] <= k) {
            dp[0][arr[0]] = true;
        }

        // Fill the DP table iteratively
        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= k; target++) {
                // Option 1: Do not take the current element
                boolean notTaken = dp[ind - 1][target];

                // Option 2: Take current element if it does not exceed target
                boolean taken = false;
                if (arr[ind] <= target) {
                    taken = dp[ind - 1][target - arr[ind]];
                }

                // Mark current cell as true if either option is true
                dp[ind][target] = notTaken || taken;
            }
        }

        // Return whether sum k can be formed using all elements
        return dp[n - 1][k];
    }
}

public class subsetSumK_6 {
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
