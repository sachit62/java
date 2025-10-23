import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int flag = true;
            int count =1;
            int maxCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i<s.length()-1 && s.charAt(i) == '1') {
                    for(int j=i+1;j<s.length();j++){
                        if(s.charAt(j)=='1'){
                            count++;
                            maxCount = Math.max(maxCount, count);
                        } else{
                            count = 1;
                        }
                    }
                }
            }
            if ((maxCount==2 || maxCount==3) ) {
                System.out.println("no");

            }else{
                System.out.println("yes");
            }
        }
    }
}