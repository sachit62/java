import java.util.*;

public class replaceEleByRank {

    public static List<Integer> replaceWithRank(List<Integer> arr, int n) {

        // Step 1: Min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {
            pq.add(val);
        }

        // Step 2: Value -> Rank mapping
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        while (!pq.isEmpty()) {
            int val = pq.poll();

            // assign rank only if not already assigned (handles duplicates)
            if (!map.containsKey(val)) {
                map.put(val, rank);
                rank++;
            }
        }

        // Step 3: Build result using original order
        List<Integer> result = new ArrayList<>();
        for (int val : arr) {
            result.add(map.get(val));
        }

        return result;
    }
}

}
