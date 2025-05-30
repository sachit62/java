import java.util.*;

public class operation {
    public static void main(String[] args) {

        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        System.out.println(hm);

        // get
        int population = hm.get("india");
        System.out.println(population);

        // contains key
        System.out.println(hm.containsKey("China"));

        // remove
        hm.remove("china");
        System.out.println(hm);

        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }
    }
}