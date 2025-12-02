// when we have to count no. of subsequences

import java.util.*;

public class subsequence_sumK3 {

    public static int f(int idx, int[] arr, int n, int sum, int k) {
        if (idx >= n) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        sum += arr[idx];
        int l = f(idx + 1, arr, n, sum, k);
        sum -= arr[idx];
        int r = f(idx + 1, arr, n, sum, k);
        return l + r;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int idx = 0;
        System.out.println(f(idx, arr, arr.length, 0, 2));
    }
}
