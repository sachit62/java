import java.util.*;

public class lisBS_20 {

    /* Function to find the longest increasing subsequence */
    public static int LIS(int[] nums) {

        int n = nums.length;

        List<Integer> temp = new ArrayList<>();
        temp.add(nums[0]);

        for (int i = 1; i < n; i++) {

            // If current element is greater than last element
            if (nums[i] > temp.get(temp.size() - 1)) {
                temp.add(nums[i]);
            }

            else {
                int ind = Collections.binarySearch(temp, nums[i]);

                if (ind < 0) 
                    ind = -(ind + 1);

                temp.set(ind, nums[i]);
            }
        }

        return temp.size();
    }

    public static void main(String[] args) {

        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};

        int lengthOfLIS = LIS(nums);

        System.out.println("Length of LIS: " + lengthOfLIS);
    }
}{

}
