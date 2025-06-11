// Unique class name as per your instruction
public class DigitCounter {

    // Function to count number of digits in an integer
    public int countDigits(int n) {
        if (n == 0) return 1; // Special case for 0

        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Main method to test
    public static void main(String[] args) {
        DigitCounter dc = new DigitCounter();
        int number = 123456;
        System.out.println("Number of digits in " + number + " is: " + dc.countDigits(number));
    }
}
