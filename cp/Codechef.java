import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            boolean odd1 = false;
            boolean even1 = false;

            for (int i = 0; i < n; i++) {
                if (a[i] == 1) {
                    if (i % 2 != 0) {
                        odd1 = true;
                    } else {
                        even1 = true;
                    }
                }
            }

            if (odd1 && even1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
            
        }
    }
}
