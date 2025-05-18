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
    }
}
