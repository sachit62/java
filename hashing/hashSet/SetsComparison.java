import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class SetsComparison {
    public static void main(String[] args) {
        System.out.println("===== HashSet =====");
        Set<String> hashSet = new HashSet<>();
        performSetOperations(hashSet);

        System.out.println("\n===== LinkedHashSet =====");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        performSetOperations(linkedHashSet);

        System.out.println("\n===== TreeSet =====");
        Set<String> treeSet = new TreeSet<>();
        performSetOperations(treeSet);
    }

    private static void performSetOperations(Set<String> set) {
        // Add elements
        set.add("banana");
        set.add("apple");
        set.add("orange");
        System.out.println("After adding elements:");
        printSet(set);

        // Check for existence
        System.out.println("Contains 'apple'? " + set.contains("apple")); // true
        System.out.println("Contains 'grape'? " + set.contains("grape")); // false

        // Remove an element
        set.remove("apple");
        System.out.println("After removing 'apple':");
        printSet(set);
    }

    private static void printSet(Set<String> set) {
        for (String element : set) {
            System.out.println("Element: " + element);
        }
    }
}
