// binary number to decimal number conversion

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        int binNum;
        Scanner sc = new Scanner(System.in);
        binNum = sc.nextInt();
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int LD = binNum % 10;
            decNum = decNum + (LD * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println(decNum);
    }
}
