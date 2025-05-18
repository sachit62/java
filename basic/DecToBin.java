// decimal number to binary number

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();
        int binNum = 0;
        int pow = 0;
        int rem;
        while (decNum > 0) {
            rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        System.out.println(binNum);
    }
}
