// 0/1 knapsack

import java.util.*;

public class knapsackMemo_8 {

    public int knapsack(int[] wt, int[] val, int W) {
        int n = wt.length;
        int[][] dp = new int[n][W + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(n - 1, W, wt, val, dp);
    }

    private int solve(int i, int W, int[] wt, int[] val, int[][] dp) {

        // Base case
        if (i == 0) {
            if (wt[0] <= W)
                return val[0];
            else
                return 0;
        }

        if (dp[i][W] != -1)
            return dp[i][W];

        int notTake = solve(i - 1, W, wt, val, dp);

        int take = 0;
        if (wt[i] <= W) {
            take = val[i] + solve(i - 1, W - wt[i], wt, val, dp);
        }

        return dp[i][W] = Math.max(take, notTake);
    }
}