// arrays introduction

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        int marks[] = new int[50]; // arrays creation
        int marks2[] = { 1, 2, 3 }; // another method for creation

        // input for array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        // output for array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // update array
        marks[0] = 100;
        System.out.println(marks[0]);

        // length of array
        System.out.println(marks.length);
    }
}
