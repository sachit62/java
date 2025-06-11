import java.util.ArrayList;
import java.util.List;

public class printDivisors {

    public static void print_divisors(int n) {
        int sqrtN = (int) Math.sqrt(n);
        List<Integer> largeDivisors = new ArrayList<>();

        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
        }

        // Print larger divisors in reverse order to keep ascending order
        for (int i = largeDivisors.size() - 1; i >= 0; i--) {
            System.out.print(largeDivisors.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.print("Divisors of " + n + ": ");
        print_divisors(n);
    }
}
