// reverse array

public class reverse {
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;

        while(first<last){
            // swap
            int temp = numbers[last];
            numbers[last]= numbers[first];
            numbers[first]=temp; 

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,5,6,7};

        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
