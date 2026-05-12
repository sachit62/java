import java.util.*;

public class Main {
    static List<Integer> primes = new ArrayList<>();
    
    static void PrimeList() {
        int limit = 150000;
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int p = 2; p <= limit; p++) {
            if (isPrime[p]) {
                primes.add(p);
                if ((long)p * p <= limit) {
                    for (int i = p * p; i <= limit; i += p)
                        isPrime[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        PrimeList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(1);
                continue;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(primes.get(0));
            for (int i = 1; i < n - 1; i++) {
                long val = (long) primes.get(i - 1) * primes.get(i);
                sb.append(" ").append(val);
            }
            sb.append(" ").append(primes.get(n - 2));
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}