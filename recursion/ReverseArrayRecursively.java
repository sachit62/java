import java.util.Arrays;

public class ReverseArrayRecursively {
    
    // Recursive function to reverse the array
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) return;

        // Swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original array: " + Arrays.toString(arr));

        reverse(arr, 0, arr.length - 1);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
