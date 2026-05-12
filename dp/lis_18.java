import java.util.*;

public class lis_18 {

    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;

        int[][] dp = new int[n + 1][n + 1];

        // base case already 0 because of Java initialization

        for(int idx = n - 1; idx >= 0; idx--){
            for(int prevIdx = idx - 1; prevIdx >= -1; prevIdx--){

                int notTake = dp[idx + 1][prevIdx + 1];

                int take = 0;
                if(prevIdx == -1 || arr[idx] > arr[prevIdx]){
                    take = 1 + dp[idx + 1][idx + 1];
                }

                dp[idx][prevIdx + 1] = Math.max(take, notTake);
            }
        }

        System.out.println(dp[0][0]);
    }
}