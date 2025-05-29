import java.util.*;

public class priorityQ {
    // object PQ
    static class Students implements Comparable<Students> {
        String name;
        int rank;

        public Students(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Students s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        // asc order
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }

        System.out.println();

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
        pq2.add(3);
        pq2.add(4);
        pq2.add(1);
        pq2.add(7);

        // desc order
         while(!pq2.isEmpty()){
            System.out.print(pq2.peek()+" ");
            pq2.remove();
        }

        System.out.println();
        // object PQ
        PriorityQueue<Students> pq3 = new PriorityQueue<>();
        pq3.add(new Students("A", 4));
        pq3.add(new Students("C", 5));
        pq3.add(new Students("B", 2));
        pq3.add(new Students("R", 12));

        while(!pq3.isEmpty()){
            System.out.println(pq3.peek().name+"->"+pq3.peek().rank);
            pq3.remove();
        }
    }
}
