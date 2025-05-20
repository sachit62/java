// strings intro

import java.util.*;

public class intro {
    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("xyz");

        // // Strings are IMMUTABLE in java means cant be chnaged
        
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);
        
        // length function
        String fullName = "Tony Stark";
        System.out.println(fullName.length());

        // concatenation
        String fname = "Sachit";
        String lname = "Kapoor";
        String Name = fname + " " + lname;
        System.out.println(Name);

        // char at function
        System.out.println(Name.charAt(1));
    }
}
