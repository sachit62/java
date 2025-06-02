import java.util.*;

public class climbingStairs {
    public static int countWays(int n) { // O(2^n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static int cwMemoization(int n, int ways[]) { // O(n)
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWays(n - 1) + countWays(n - 2);
        return ways[n];
    }

    public static int cwTabulation(int n) { // O(n)
        int dp[] = new int[n + 1];

        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n));
        System.out.println(cwMemoization(n, ways));
        System.out.println(cwTabulation(n));
    }
}
