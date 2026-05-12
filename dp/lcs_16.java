import java.util.*;

public class lcs_16 {

    public static void main(String[] args) {

        String s = "abcde";
        String t = "ace";

        int n = s.length();
        int m = t.length();

        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        for (int j = 0; j <= m; j++)
            prev[j] = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {

                if (s.charAt(i - 1) == t.charAt(j - 1))
                    cur[j] = 1 + prev[j - 1];
                else
                    cur[j] = Math.max(prev[j], cur[j - 1]);

            }

            prev = cur.clone();
        }

        System.out.println(prev[m]);
    }
}