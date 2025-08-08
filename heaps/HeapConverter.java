public class HeapConverter {

    // Function to convert min-heap to max-heap
    public static void convertMinToMaxHeap(int[] arr) {
        int n = arr.length;

        // Start from last non-leaf node and heapify downwards
        for (int i = (n - 2) / 2; i >= 0; i--) {
            maxHeapify(arr, i, n);
        }
    }

    // Max-heapify function
    private static void maxHeapify(int[] arr, int i, int n) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child exists and is greater
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child exists and is greater
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the parent
        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            maxHeapify(arr, largest, n);
        }
    }

    public static void main(String[] args) {
        int[] minHeap = {1, 3, 5, 7, 9, 11};

        System.out.println("Min Heap: ");
        printArray(minHeap);

        convertMinToMaxHeap(minHeap);

        System.out.println("Max Heap: ");
        printArray(minHeap);
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
