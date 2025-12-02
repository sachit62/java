// when only 1 satisfied condition answer has to be returned

import java.util.*;

public class subsequence_sumK2 {

    public static boolean f(int idx, int[] arr, int n, ArrayList<Integer> a, int sum, int k) {
        if (idx >= n) {
            if (sum == k) {
                System.out.println(a);
                return true;
            }
            return false;
        }
        a.add(arr[idx]);
        sum += arr[idx];
        if (f(idx + 1, arr, n, a, sum, k) == true)
            return true;
        a.remove(a.size() - 1);
        sum -= arr[idx];
        if (f(idx + 1, arr, n, a, sum, k) == true)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int idx = 0;
        ArrayList<Integer> a = new ArrayList<>();
        f(idx, arr, arr.length, a, 0, 2);
    }
}
