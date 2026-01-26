// adjacency lists implementation when its a weighted graph

import java.util.*;

class Pair {
    int v;       // neighbor
    int weight;  // edge weight

    Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }
}

public class adjacencyLists2 {
    public static void main(String[] args) {

        int n = 3; // nodes: 1,2,3

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        // create n+1 lists (1-based indexing)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Pair>());
        }

        // edge 1 --(5)-- 2
        adj.get(1).add(new Pair(2, 5));
        adj.get(2).add(new Pair(1, 5));  // dont include when directed graph

        // edge 2 --(3)-- 3
        adj.get(2).add(new Pair(3, 3));
        adj.get(3).add(new Pair(2, 3));

        // edge 1 --(10)-- 3
        adj.get(1).add(new Pair(3, 10));
        adj.get(3).add(new Pair(1, 10));

        // print adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (Pair p : adj.get(i)) {
                System.out.print("(" + p.v + ", " + p.weight + ") ");
            }
            System.out.println();
        }
    }
}
