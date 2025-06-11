// Unique class name as per your instruction
public class GCDCalculator {

    // Function to compute GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Main method to test
    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
