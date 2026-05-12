import java.util.*;

public class lis_19 {

    public static void main(String[] args) {

        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;

        int[] ahead = new int[n + 1];
        int[] cur = new int[n + 1];

        for(int idx = n - 1; idx >= 0; idx--){

            for(int prevIdx = idx - 1; prevIdx >= -1; prevIdx--){

                int notTake = ahead[prevIdx + 1];

                int take = 0;
                if(prevIdx == -1 || arr[idx] > arr[prevIdx]){
                    take = 1 + ahead[idx + 1];
                }

                cur[prevIdx + 1] = Math.max(take, notTake);
            }

            ahead = cur.clone();
        }

        System.out.println(ahead[0]);
    }
}