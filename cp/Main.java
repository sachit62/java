import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // number of days
            int k = sc.nextInt(); // length of hike
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); // weather: 0 = good, 1 = rain
            }

            int hikes = 0;
            int i = 0;
            while (i <= n - k) {
                boolean canHike = true;
                for (int j = i; j < i + k; j++) {
                    if (a[j] == 1) {
                        canHike = false;
                        break;
                    }
                }

                if (canHike) {
                    hikes++;
                    i += k + 1;
                } else {
                    i++;
                }
            }

            System.out.println(hikes);
        }
    }
}
