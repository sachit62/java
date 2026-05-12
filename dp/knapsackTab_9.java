// 0/1 knapsack

import java.util.*;

public class knapsackTab_9 {

    public int knapsack(int[] wt, int[] val, int W) {

        int n = wt.length;
        int[][] dp = new int[n][W + 1];

        // Base case initialization
        for (int w = wt[0]; w <= W; w++) {
            dp[0][w] = val[0];
        }

        for (int i = 1; i < n; i++) {
            for (int w = 0; w <= W; w++) {

                int notTake = dp[i - 1][w];

                int take = 0;
                if (wt[i] <= w) {
                    take = val[i] + dp[i - 1][w - wt[i]];
                }

                dp[i][w] = Math.max(take, notTake);
            }
        }

        return dp[n - 1][W];
    }
}