import java.util.* ;
import java.io.*; 

public class subsetSum {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> a = new ArrayList<>();
        func(num,a,0,0);
        Collections.sort(a);
        return a;
    }
    public static void func(int[] num, ArrayList<Integer> a, int sum, int idx){
        // base case
        if(idx==num.length){
            a.add(sum);
            return;
        }

        sum += num[idx];
        func(num,a,sum,idx+1);
        sum -= num[idx];
        func(num,a,sum,idx+1);
    }
}
