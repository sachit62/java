// max subarray sum more optimized printing subarray giving maxsum not directly maxsum
// kadane's algorithm , TC - N
// striver a to z playlist step3-lec2-kadanes algo

import java.util.*;

public class max_subarray_sum3 {

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        int start = 0;       // start index for current subarray
        int tempStart = 0;   // potential start index
        int end = 0;         // end index for max subarray

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];

            // If new max found, update indices
            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            // Reset if sum becomes negative
            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1; // next index may be new start
            }
        }

        // Print result
        System.out.println("Max Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 5, 7, 1, 0, 9 };
        kadanes(numbers);
    }
}
