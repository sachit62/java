import java.util.*;

public class trial {

    public static int len(int k1, int k2, int l1, int l2, String s1, String s2){
        StringBuilder f = new StringBuilder();
        StringBuilder s = new StringBuilder();

        for(int i=k1;i<s1.length();i++){
            f.append(s1.charAt(i));
        }
        for(int i=k2;i<s2.length();i++){
            s.append(s2.charAt(i));
        }

        if(f.length() != s.length()){
            return -1;
        } else if(f.isEmpty() || s.isEmpty()){
            return 0;
        }

        boolean flag = true;
        for(int i=0;i<f.length();i++){
            if(f.charAt(i)!=s.charAt(i)){
                flag = false;
            }
        }
        if(!flag){
            return -1;
        }
        return f.length();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        // String s1 = sc.nextLine(); // yaha pe haga instead of nextLine(),  next() use kro
        // String s2 = sc.nextLine(); // haga
        String s1 = sc.next();
        String s2 = sc.next(); // correct now
        int length = len(k1,k2,l1,l2,s1,s2);
        System.out.println(length);
    }
}
