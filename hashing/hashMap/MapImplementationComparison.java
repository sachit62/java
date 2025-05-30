import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class MapImplementationComparison {
    public static void main(String[] args) {
        System.out.println("===== HashMap =====");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("banana", 3);
        hashMap.put("apple", 5);
        hashMap.put("orange", 2);
        printMap(hashMap);  // No guaranteed order

        System.out.println("\n===== LinkedHashMap =====");
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("banana", 3);
        linkedHashMap.put("apple", 5);
        linkedHashMap.put("orange", 2);
        printMap(linkedHashMap);  // Maintains insertion order

        System.out.println("\n===== TreeMap =====");
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("banana", 3);
        treeMap.put("apple", 5);
        treeMap.put("orange", 2);
        printMap(treeMap);  // Sorted by key
    }

    private static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
