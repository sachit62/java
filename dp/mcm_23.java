class Solution {
    public int matrixMultiplication(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];

        // Initialize the dp array with large values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        // A single matrix doesn't require any multiplication
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        // Filling the dp array in a bottom-up manner
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j < n; j++) {
                int mini = 1000009;
                for (int k = i; k < j; k++) {
                    // Calculate cost
                    int steps = dp[i][k] + dp[k + 1][j] + nums[i - 1] * nums[k] * nums[j];
                    // Take the minimum cost
                    if (steps < mini) {
                        mini = steps;
                    }
                }
                dp[i][j] = mini;
            }
        }

        // The result is in dp[1][n-1] (multiplying from matrix 1 to n-1)
        return dp[1][n - 1];
    }
}

public class mcm_23 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 10, 15, 20, 25 };

        // Output should be 8000
        System.out.println("Minimum number of multiplications: " + sol.matrixMultiplication(nums));
    }
}