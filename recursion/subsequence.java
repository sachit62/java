import java.util.ArrayList;

public class subsequence {
    public static void f(int idx, int[] arr, int n, ArrayList<Integer> a) {
        if (idx >= n) {
            System.out.println(a);
            return;
        }
        a.add(arr[idx]);
        f(idx + 1, arr, n, a);
        a.remove(a.size()-1);
        f(idx + 1, arr, n, a);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        int idx = 0;
        ArrayList<Integer> a = new ArrayList<>();
        f(idx, arr, arr.length, a);
    }
}
