// striver a to z playlist step4-lec1-number of times an array has been rotated 

public class n_rotations {
    public static void main(String[] args) {
        int nums[] = {6,5,4,3,2,1};
        // Code here
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            // If array is already sorted, then start is the smallest
            if (nums[start] <= nums[end]) {
                System.out.println(start);; // rotation count
            }
            
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % nums.length;
            int prev = (mid - 1 + nums.length) % nums.length;
            
            // Check if mid element is the minimum
            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
                System.out.println(mid);;
            } 
            
            // Decide whether we need to go to left half or right half
            if (nums[mid] >= nums[start]) {
                // Left part is sorted, so rotation must be in right half
                start = mid + 1;
            } else {
                // Right part is sorted, so rotation must be in left half
                end = mid - 1;
            }
        }
        
        System.out.println(0);; // Not rotated
    }
}

