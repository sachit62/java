import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc-- > 0) {

            int n = sc.nextInt();     
            int m = sc.nextInt(); 
            long h = sc.nextLong();  

            long[] a = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }

            
        }

        sc.close();
    }
}
