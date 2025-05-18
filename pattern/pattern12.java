// solid rhombus

import java.util.*;

public class pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            // 1st spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            // star
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
