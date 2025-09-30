// Striver a to z playlist step3-lec3-largest subarray with 0 sum

import java.util.HashMap;

public class largest_subarray_0 {
    public static int maxLen(int a[], int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += a[i];
            if(sum==0){
                maxi = i+1;
            } else{
                if(map.get(sum) != null){
                    maxi = Math.max(maxi,i-map.get(sum));
                } else{
                    map.put(sum,i);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int a[] = {5,-1,-1,-1,-3,1,3,4,-6};
        System.out.println(maxLen(a,9));
    }
}
