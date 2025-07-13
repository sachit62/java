// print n to 1 in decreasing order

public class decreasing{

    public static void printDecr(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        printDecr(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        printDecr(n);
    }
}