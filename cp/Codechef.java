import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int ans = n * n;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print((i+j)%n);
                    if(j<n-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
        }
    }
}
