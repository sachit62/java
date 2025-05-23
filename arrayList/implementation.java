import java.util.ArrayList;

public class implementation {
    public static void main(String[] args) {
        // classname objectname = new classname();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        ArrayList<Float> list4 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get
        int element = list.get(1);
        System.out.println(element);

        // delete
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2, 5);
        System.out.println(list);

        // contain
        System.out.println(list.contains(1));

        // add another use
        list.add(1,9); // O(n)
        System.out.println(list);

        // size
        System.out.println(list.size());

        // print arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
