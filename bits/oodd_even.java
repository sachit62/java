// check odd even

public class oodd_even {

    public static void check(int n) {
        int bitMask = 1;
        if((n&bitMask)==0){
            // even number
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        check(5);
        check(0);
    }
}
