// brute TC:O(n)   SC:O(n)
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n; // Handle k > n
//         int[] nums2 = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums2[i] = nums[(i + k) % n]; // For left rotation
//         }

//         for (int i = 0; i < n; i++) {
//             nums[i] = nums2[i];
//         }
//     }
// }



// TC:O(2n) SC:O(1)
public class leftRotate {
    public static void main(String[] args) {
        int k = 3;
        int arr[] = {1,2,3,4,5,6,7};
        k = k % arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[], int left, int right){
        while(left<=right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}
