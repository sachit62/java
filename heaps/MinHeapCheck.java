// In a min-heap, every parent node’s value must be less than or equal to its children’s values.

public class MinHeapCheck {

    public static boolean isMinHeap(int[] arr) {
        int n = arr.length;

        // Only need to check non-leaf nodes: index 0 to n/2 - 1
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1;  // left child index
            int right = 2 * i + 2; // right child index

            // If left child exists and is smaller than parent
            if (left < n && arr[i] > arr[left]) {
                return false;
            }

            // If right child exists and is smaller than parent
            if (right < n && arr[i] > arr[right]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] heap1 = {1, 3, 5, 7, 9, 11}; // Valid min-heap
        int[] heap2 = {2, 1, 3};           // Not a min-heap

        System.out.println(isMinHeap(heap1)); // true
        System.out.println(isMinHeap(heap2)); // false
    }
}
