public class numberOfNges {
    public static int[] countGreater(int[] arr, int[] indices) {
        // Write your code here.
        int N = arr.length;
        int[] ans = new int[indices.length];

        // For every query
        for (int qi = 0; qi < indices.length; qi++) {

            int idx = indices[qi]; // given index
            int val = arr[idx]; // value at that index

            int count = 0;

            // Count elements greater than val to the right
            for (int j = idx + 1; j < N; j++) {
                if (arr[j] > val) {
                    count++;
                }
            }

            ans[qi] = count;
        }

        return ans;
    }
}
