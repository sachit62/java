import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int diff = 0;
            int maxi = 0;
            int mini = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                maxi = Math.max(maxi,a[i]);
                mini = Math.min(mini,a[i]);
                diff = Math.min(diff,a[i]-a[i-1]);
            }
            int count = 0;
            int d = 0;
            for(int i=1;i<n;i++){

            }
        }
    }
}