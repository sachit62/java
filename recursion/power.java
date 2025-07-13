// O(log n)

public class power {

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pow(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println(pow(5, 3));
    }
}
