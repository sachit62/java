import java.util.*;

public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(5);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // desc
        Collections.sort(list, Collections.reverseOrder());
        // comparator use hua reverse ke liye
        System.out.println(list);
    }
    
}
