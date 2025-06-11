public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // 0 and 1 are not prime numbers
        if (n == 2) return true;   // 2 is prime
        if (n % 2 == 0) return false;  // even numbers greater than 2 are not prime

        int sqrtN = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrtN; i += 2) {  // check only odd divisors
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;  // You can change this value to test other numbers

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
