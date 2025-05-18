// diamond pattern 

public class pattern14 {
    public static void main(String[] args) {
        // 1st half
        for(int i=1;i<=4;i++){
            // spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for(int i=4;i>=1;i--){
            // spaces
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }

            // stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
