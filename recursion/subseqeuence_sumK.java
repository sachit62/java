import java.util.*;

public class subseqeuence_sumK {

    public static void f(int idx, int[] arr, int n, ArrayList<Integer> a, int sum, int k) {
        if (idx >= n) {
            if (sum == k) {
                System.out.println(a);
            }
            return;
        }
        a.add(arr[idx]);
        sum += arr[idx];
        f(idx + 1, arr, n, a, sum, k);
        a.remove(a.size() - 1);
        sum -= arr[idx];
        f(idx + 1, arr, n, a, sum, k);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int idx = 0;
        ArrayList<Integer> a = new ArrayList<>();
        f(idx, arr, arr.length, a, 0, 2);
    }
}
