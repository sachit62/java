// ninja training memoization 2d dp

import java.util.*;

public class ninjaTraining_2 {
    static int solve(int day, int last, int[][] points, int[][] dp) {

        // Base Case
        if (day == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != last) {
                    maxi = Math.max(maxi, points[0][task]);
                }
            }
            return dp[day][last] = maxi;
        }

        if (dp[day][last] != -1)
            return dp[day][last];

        int maxi = 0;

        for (int task = 0; task < 3; task++) {
            if (task != last) {
                int point = points[day][task] +
                        solve(day - 1, task, points, dp);
                maxi = Math.max(maxi, point);
            }
        }

        return dp[day][last] = maxi;
    }

    public static int ninjaTraining(int n, int[][] points) {
        int[][] dp = new int[n][4];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(n - 1, 3, points, dp);
    }
}
