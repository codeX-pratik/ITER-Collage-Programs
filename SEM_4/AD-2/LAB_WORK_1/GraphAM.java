public class GraphAM {
    int count;
    int[][]arr;

    public GraphAM(int c) {
        count = c;
        arr = new int[count][count];
    }

    public void addDirectedEdge(int src, int dest, int cost) {
        arr[src][dest] = cost;
    }

    public void addUnDirectedEdge(int src, int dest, int cost) {
        addDirectedEdge(src, dest, cost);
        addDirectedEdge(dest, src, cost);
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print("Node index " + (i + 1) + " is connected with: ");
            for (int j = 0; j < count; j++) {
                if (arr[i][j] != 0) {
                    System.out.print((j + 1) + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        GraphAM graph = new GraphAM(4);
        graph.addUnDirectedEdge(0, 1, 1);
        graph.addUnDirectedEdge(0, 2, 1);
        graph.addUnDirectedEdge(1, 2, 1);
        graph.addUnDirectedEdge(2, 3, 1);
        graph.print();
    }
}