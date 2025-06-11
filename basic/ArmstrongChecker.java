public class ArmstrongChecker {

    // Check if a number is an Armstrong number of n digits
    static boolean isArmstrong(int n) {
        int temp = n, digits = 0, sum = 0;

        // Count digits
        int t = n;
        while (t != 0) {
            digits++;
            t /= 10;
        }

        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits); // use power based on number of digits
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int num = 1634;  // Example: 9474 is a 4-digit Armstrong number
        System.out.println(num + (isArmstrong(num) ? " is" : " is not") + " an Armstrong number.");
    }
}
