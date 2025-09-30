// striver a to z playlist step4-lec1-implement lower bound
// arr[idx]>=x

public class lower_bound {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        int x = 6;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}
