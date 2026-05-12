import java.util.*;

public class lis_17 {
    static int solve(int idx, int prevIdx, int[] arr, int[][] dp) {

        if (idx == arr.length)
            return 0;

        if (dp[idx][prevIdx + 1] != -1)
            return dp[idx][prevIdx + 1];

        // not take
        int notTake = solve(idx + 1, prevIdx, arr, dp);

        // take
        int take = 0;
        if (prevIdx == -1 || arr[idx] > arr[prevIdx]) {
            take = 1 + solve(idx + 1, idx, arr, dp);
        }

        return dp[idx][prevIdx + 1] = Math.max(take, notTake);
    }

    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;

        int[][] dp = new int[n][n + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(solve(0, -1, arr, dp));
    }
}