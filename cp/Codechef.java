import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            boolean flag = true;
            int count1 = 0;
            int count0 = 0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='1'){
                    count1++;
                }else {
                    count0++;
                }
            }
            int grps = n/k;
            int min1 = 0;
            int max1 = 0;
            for(int i=0;i<n;i++){
                int grpSize = ((n-i-1)/k)+1;
                min1 += grpSize/2;
                max1 += (grpSize+1)/2;
            }
            if(count1>=min1 && count1<=max1){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }
        }
    }
}