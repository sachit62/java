import java.util.*;

public class priorityQ {

    // Object PriorityQueue (Custom Heap)
    static class Students implements Comparable<Students> {
        String name;
        int rank;

        public Students(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        // Min-heap based on rank
        @Override
        public int compareTo(Students s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {

        // ================= INTEGER MIN HEAP =================
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add / offer
        pq.add(3);
        pq.offer(4);
        pq.add(1);
        pq.add(7);

        // peek -> smallest element
        System.out.println("Peek element: " + pq.peek());

        // size
        System.out.println("Size: " + pq.size());

        // contains
        System.out.println("Contains 4? " + pq.contains(4));

        // remove / poll (ascending order)
        System.out.print("Min Heap order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();

        // ================= INTEGER MAX HEAP =================
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(3);
        pq2.add(4);
        pq2.add(1);
        pq2.add(7);

        System.out.print("Max Heap order: ");
        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
        System.out.println();

        // ================= OBJECT HEAP =================
        PriorityQueue<Students> pq3 = new PriorityQueue<>();

        pq3.add(new Students("A", 4));
        pq3.add(new Students("C", 5));
        pq3.add(new Students("B", 2));
        pq3.add(new Students("R", 12));

        System.out.println("Students by Rank (Min Heap):");
        while (!pq3.isEmpty()) {
            Students s = pq3.peek();
            System.out.println(s.name + " -> " + s.rank);
            pq3.remove();
        }

        // ================= CLEAR & EMPTY CHECK =================
        PriorityQueue<Integer> pq4 = new PriorityQueue<>();
        pq4.add(10);
        pq4.add(20);

        System.out.println("Before clear, size: " + pq4.size());
        pq4.clear(); // removes all elements
        System.out.println("Is Empty after clear? " + pq4.isEmpty());
    }
}
