import java.util.*;

public class lcs_15 {

    public static void main(String[] args) {

        String s = "abcde";
        String t = "ace";

        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int j = 0; j <= m; j++)
            dp[0][j] = 0;

        for (int i = 0; i <= n; i++)
            dp[i][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }
        }

        System.out.println(dp[n][m]);
    }
}