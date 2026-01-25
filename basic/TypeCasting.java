// type casting bade data type se chote mai krna jabardasti

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float marks = 99.9f; // f isleye taaki double na le
        int marks2 = (int) marks;
        System.out.println(marks2);

        char ch = 'a';
        int number = ch;
        System.out.println(number); // ascii of 'a' will print

        // when range limit is exceeded
        byte b = 12;
        int a = 257;
        System.out.println((byte) a); // 257 % 256(range) = 1
    }
}
