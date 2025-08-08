import java.util.*;

public class heapSort {

    // Heapify for max heap (ascending order)
    public static void heapifyMax(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            heapifyMax(arr, maxIdx, size);
        }
    }

    // Heapify for min heap (descending order)
    public static void heapifyMin(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < size && arr[left] < arr[minIdx]) {
            minIdx = left;
        }
        if (right < size && arr[right] < arr[minIdx]) {
            minIdx = right;
        }

        if (minIdx != i) {
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;

            heapifyMin(arr, minIdx, size);
        }
    }

    // Ascending order using max heap
    public static void heapsortAscending(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2; i >= 0; i--) {
            heapifyMax(arr, i, n);
        }

        // Extract elements
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyMax(arr, 0, i);
        }
    }

    // Descending order using min heap
    public static void heapsortDescending(int arr[]) {
        int n = arr.length;

        // Build min heap
        for (int i = n / 2; i >= 0; i--) {
            heapifyMin(arr, i, n);
        }

        // Extract elements
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapifyMin(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 5, 3 };
        int arr2[] = { 1, 2, 4, 5, 3 };

        // Ascending order
        heapsortAscending(arr1);
        System.out.println("Ascending: " + Arrays.toString(arr1));

        // Descending order
        heapsortDescending(arr2);
        System.out.println("Descending: " + Arrays.toString(arr2));
    }
}
