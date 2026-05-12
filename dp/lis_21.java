import java.util.*;

public class lis_21 {

    // Function to return the LIS as a list
    public static List<Integer> longestIncreasingSubsequence(int[] nums) {

        int n = nums.length;

        int[] dp = new int[n];
        int[] prev = new int[n];

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                if (nums[j] < nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }

            }
        }

        int maxLen = 0, maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                maxIndex = i;
            }
        }

        List<Integer> lisSeq = new ArrayList<>();

        int curr = maxIndex;

        while (curr != -1) {
            lisSeq.add(nums[curr]);
            curr = prev[curr];
        }

        Collections.reverse(lisSeq);

        return lisSeq;
    }

    public static void main(String[] args) {

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        List<Integer> lis = longestIncreasingSubsequence(nums);

        System.out.print("LIS: ");
        for (int x : lis) System.out.print(x + " ");
    }
}