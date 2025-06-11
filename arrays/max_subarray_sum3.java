// max subarray sum more optimized
// kadane's algorithm , TC - N

import java.util.*;

public class max_subarray_sum3 {

    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currSum = currSum + numbers[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -1 };
        kadanes(numbers);
    }
}
