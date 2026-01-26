// use of adjacency lists unweighted graph is shown here

import java.io.*;
import java.util.*;

public class adjacencyLists {
    public static void main(String[] args) {

        int n = 3; // nodes: 1,2,3
        int m = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // create n+1 lists (for 1-based indexing)
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // adj.get(u).add(v);
        // adj.get(v).add(u);  // dont include when directed graph

        // edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // print adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
