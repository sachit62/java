// striver a to z playlist step4-lec2-nth root of a number

public class nth_root {
    // Fast exponentiation (O(log n))
    public static long power(long m, long n) {
        long result = 1;
        long base = m;

        while (n > 0) {
            if ((n & 1) == 1) {
                result *= base;
            }
            base *= base;
            n >>= 1;
        }
        return result;
    }

    // Function to find nth root of m
    public int nthRoot(int n, int m) {
        int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long val = power(mid, n);

            if (val == m) {
                return mid; // found exact root
            } else if (val < m) {
                low = mid + 1; // root is bigger
            } else {
                high = mid - 1; // root is smaller
            }
        }
        return -1; // if no exact integer root exists
    }}