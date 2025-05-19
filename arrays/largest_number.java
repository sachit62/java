// largest number in array

import java.util.*;

public class largest_number {
    public static void main(String[] args) {
        int numbers[] = {1,5,3,4,2,7,8,6};
        int largest = Integer.MIN_VALUE; 
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        System.out.println(largest );
    }
}
