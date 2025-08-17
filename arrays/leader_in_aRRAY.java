// striver a to z playlist - step 3 - lec 2 - leaders in an array

public class leader_in_aRRAY{
    public static void main(String[] args) {
        int arr[] = {7,10,5,4};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}