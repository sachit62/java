// how graph is represented using adjacency matrix is shown here

class Graph {
    int[][] adjMatrix;
    int vertices;

    Graph(int v) {
        vertices = v;
        adjMatrix = new int[v][v];
    }

    void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; // because undirected
    }
    // Directed Graph
    // Just remove the second assignment:
    // adjMatrix[u][v]=1; // only one direction

    // Weighted Graph
    // Store weight instead of 1:
    // adjMatrix[u][v] = weight;


    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class graphRepresentationMat_3 {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.printGraph();
    }
}
