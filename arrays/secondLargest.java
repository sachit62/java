// striver a to z playlist step3-lec1-2nd largest number
// O(n)

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = {3,1,2,7,5};
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            } else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);
    }
}
