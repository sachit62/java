// 0/1 knapsack

import java.util.*;

public class knapsackSpaceOpt_10 {

    public int knapsack(int[] wt, int[] val, int W) {

        int n = wt.length;
        int[] dp = new int[W + 1];

        // Base case
        for (int w = wt[0]; w <= W; w++) {
            dp[w] = val[0];
        }

        for (int i = 1; i < n; i++) {
            for (int w = W; w >= 0; w--) {

                int notTake = dp[w];

                int take = 0;
                if (wt[i] <= w) {
                    take = val[i] + dp[w - wt[i]];
                }

                dp[w] = Math.max(take, notTake);
            }
        }

        return dp[W];
    }
}