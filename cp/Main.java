import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int n = S.length();
        char[] T = new char[n];

        // Initialize T same as S (copy #, keep . as placeholder)
        for (int i = 0; i < n; i++) {
            T[i] = (S.charAt(i) == '#') ? '#' : '.';
        }

        int i = 0;
        while (i < n) {
            if (S.charAt(i) == '#') {
                i++;
            } else {
                // start of dot-segment
                int j = i;
                while (j < n && S.charAt(j) == '.') {
                    j++;
                }

                // choose a position to place one 'o' in this segment
                int mid = (i + j - 1) / 2;
                T[mid] = 'o';

                // move to end of segment
                i = j;
            }
        }

        System.out.println(new String(T));
    }
}
