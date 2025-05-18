// n =4
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *
// butterfly pattern

public class pattern11 {
    public static void main(String[] args) {
        // 1st half
        for (int i = 1; i <= 4; i++) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for (int i = 4; i >= 1; i--) {
            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces 2*(n-i)
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }

            // stars i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
