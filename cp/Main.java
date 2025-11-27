import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            ArrayList<Integer> odds = new ArrayList<>();
            ArrayList<Integer> evens = new ArrayList<>();

            boolean hasOdd = false;
            boolean hasEven = false;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] % 2 == 0) {
                    evens.add(a[i]);
                    hasEven = true;
                } else {
                    odds.add(a[i]);
                    hasOdd = true;
                }
            }

            if (!hasOdd || !hasEven) {
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                continue;
            }

            Collections.sort(odds);
            Collections.sort(evens);

            ArrayList<Integer> result = new ArrayList<>();
            int o = 0;
            int e = 0;

            while (o < odds.size() && e < evens.size()) {
                if (odds.get(o) < evens.get(e)) {
                    result.add(odds.get(o));
                    o++;
                } else {
                    result.add(evens.get(e));
                    e++;
                }
            }

            while (o < odds.size()) {
                result.add(odds.get(o++));
            }
            while (e < evens.size()) {
                result.add(evens.get(e++));
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
