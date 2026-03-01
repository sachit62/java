    

import java.io.*;
import java.util.*;
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    public int findUPar(int node) {
        if (node == parent.get(node)) {
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            int rankU = rank.get(ulp_u);
            rank.set(ulp_u, rankU + 1);
        }
    }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);
        if (ulp_u == ulp_v) return;
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_v) + size.get(ulp_u));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }
}
// using arrays
// class DisjointSet {

//     private int[] parent;
//     private int[] rank;
//     private int[] size;

//     public DisjointSet(int n) {
//         parent = new int[n + 1];
//         rank = new int[n + 1];
//         size = new int[n + 1];

//         for (int i = 0; i <= n; i++) {
//             parent[i] = i;
//             rank[i] = 0;
//             size[i] = 1;
//         }
//     }

//     // Path Compression
//     public int findUPar(int node) {
//         if (parent[node] != node) {
//             parent[node] = findUPar(parent[node]);
//         }
//         return parent[node];
//     }

//     // Union by Rank
//     public void unionByRank(int u, int v) {
//         int pu = findUPar(u);
//         int pv = findUPar(v);

//         if (pu == pv) return;

//         if (rank[pu] < rank[pv]) {
//             parent[pu] = pv;
//         } else if (rank[pv] < rank[pu]) {
//             parent[pv] = pu;
//         } else {
//             parent[pv] = pu;
//             rank[pu]++;
//         }
//     }

//     // Union by Size
//     public void unionBySize(int u, int v) {
//         int pu = findUPar(u);
//         int pv = findUPar(v);

//         if (pu == pv) return;

//         if (size[pu] < size[pv]) {
//             parent[pu] = pv;
//             size[pv] += size[pu];
//         } else {
//             parent[pv] = pu;
//             size[pu] += size[pv];
//         }
//     }
// }

public class disjointSet_25 {
    public static void main (String[] args) {
        DisjointSet ds = new DisjointSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        // if 3 and 7 same or not
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");

        ds.unionByRank(3, 7);
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else
            System.out.println("Not Same");
    }
}

