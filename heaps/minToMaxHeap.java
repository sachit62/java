public class minToMaxHeap {
    
    static void convertMinToMaxHeap(int N, int arr[]) {
        // Start from last non-leaf node and heapify each node
        for (int i = N / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, N, i);
        }
    }
    
    // Function to maintain max-heap property
    static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        
        if (largest != i) {
            // Swap
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            // Heapify the affected subtree
            maxHeapify(arr, n, largest);
        }
    }
}

}
