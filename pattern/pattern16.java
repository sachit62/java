//     1
//    212
//   32123
//  4321234
// 543212345

public class pattern16 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            // spaces
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            // number desc
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            // number asc
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
