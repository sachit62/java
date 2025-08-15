// striver a2z playlist step1-lec4-gcd

import java.util.*;

public class GCDCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // logic
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }

        System.out.println(a);
    }
}