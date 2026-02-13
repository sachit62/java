// T.C: O(E log E)
// S.C: O(E + V)
import java.util.*;

// Edge class
class Edge implements Comparable<Edge> {
    int u, v, wt;

    Edge(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }

    public int compareTo(Edge other) {
        return this.wt - other.wt;
    }
}

// Your Disjoint Set
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
        if (node == parent.get(node)) return node;
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
            rank.set(ulp_u, rank.get(ulp_u) + 1);
        }
    }
}

public class kruskal_26 {

    public static void main(String[] args) {

        int V = 7;

        List<Edge> edges = new ArrayList<>();

        // u, v, weight
        edges.add(new Edge(1, 2, 2));
        edges.add(new Edge(1, 4, 1));
        edges.add(new Edge(2, 3, 3));
        edges.add(new Edge(2, 4, 2));
        edges.add(new Edge(3, 5, 1));
        edges.add(new Edge(4, 5, 3));
        edges.add(new Edge(5, 6, 2));
        edges.add(new Edge(6, 7, 1));

        // Step 1: Sort edges by weight
        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(V);

        int mstWeight = 0;
        List<Edge> mstEdges = new ArrayList<>();

        // Step 2: Process edges
        for (Edge e : edges) {

            int u = e.u;
            int v = e.v;
            int wt = e.wt;

            if (ds.findUPar(u) != ds.findUPar(v)) {

                mstWeight += wt;
                mstEdges.add(e);

                ds.unionByRank(u, v);
            }
        }

        // Print MST
        System.out.println("MST Edges:");
        for (Edge e : mstEdges) {
            System.out.println(e.u + " - " + e.v + " weight: " + e.wt);
        }

        System.out.println("Total MST Weight = " + mstWeight);
    }
}
