// striver a2z playlist step1-lec5-print n times

public class print_n {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args){
        print(10);
    }
}
