public class pairsum {

    public static boolean pairsum1(int list[],int target){
        // for(int i=0;i<list.length;i++){
        //     for(int j=i+1;j<list.length;j++){
        //         if(list[i]+list[j]==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        // brute force



        // 2 ptr approach
        int lp=0;
        int rp=list.length-1;

        while(lp!=rp){
            // case 1
            if(list[lp]+list[rp]==target){
                return true;
            }

            // case 2
            if(list[lp]+list[rp]<target){
                lp++;
            }
            else{
                // case 3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int list[] = {1,2,3,4,5,6};
        int target = 7;
        System.out.println(pairsum1(list, target));
    }
}
