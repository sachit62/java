import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count0=0;
            int count1=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'){
                    count0++;
                } else{
                    count1++;
                }
            }
            if(count1>=count0){
                System.out.println(0);
                continue;
            }
            int count=0;
            while(count0>count1){
                count0--;
                count1++;
                count++;
            }
            System.out.println(count);
        }
    }
}