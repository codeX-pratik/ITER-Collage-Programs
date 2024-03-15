import java.util.*;

public class Lab_work_3 {
    public static void main(String[] args) {
        System.out.println(power_Recursion(5, 3));
    }

    // Bubble sorting
    static int[] bubbleSort(int []arr, int n) {
        for (int i=0 ; i<n-1 ; i++) {
            for (int j=0 ; j<n-i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // Linear Search using Iteration Method
    static int linearSearch_Iteration(int []arr, int k) {
        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    // Linear Search using Recursion Method
    static int linearSearch_Recursion(int []arr, int n, int k) {
        if (n <= 0) {
            return -1;
        }
        if (arr[n-1] == k) {
            return n-1;
        }
        return linearSearch_Recursion(arr, n-1, k);
    }

    // x to power n in Iteration
    static int power_Iteration(int x, int n) {
        int ans = 1;
        for (int i=0 ; i<n ; i++) {
            ans *= x;
        }
        return ans;
    }

    // x to power n in Recursion
    static int power_Recursion(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power_Recursion(x, n-1);
        }
    }
}

class GraphAL {
    
    int count;
    private LinkedList<LinkedList<Edge>> Adj;

    private static class Edge {
        private int dest;
        private int cost;

        public Edge(int dst, int cst) {
            dest = dst;
            cost = cst;
        }
    }

    public GraphAL(int cnt) {
        count = cnt;
        Adj = new LinkedList<LinkedList<Edge>>();
        
        for (int i=0 ; i<cnt ; i++) {
            Adj.add(new LinkedList<Edge>());
        }
    }
    
    private void addDirectedEdge(int source, int dest, int cost) {
        Edge edge = new Edge(dest, cost);
        Adj.get(source).add(edge);
    }

    public void addDirectedEdge(int source, int dest) {
        addDirectedEdge(source, dest, 1);
    }

    public void addUndirectedEdge(int source, int dest, int cost) {
        addDirectedEdge(source, dest, cost);
        addDirectedEdge(dest, source, cost);
    }

    public void addUndirectedEdge(int source, int dest) {
        addUndirectedEdge(source, dest, 1);
    }

    public void print() {
        for (int i=0 ; i<count ; i++) {
            LinkedList<Edge> ad = Adj.get(i);
            System.out.print("\nVertex " + (i+1) + " is connected to : ");
            for (Edge adn : ad) {
                System.out.print("("+ (adn.dest+1) + ", " + adn.cost + ")");
            }
        }
    }

    static class EdgeComparator implements Comparator<Edge> {
        public int compare(Edge x, Edge y) {
            if (x.cost < y.cost) {
                return -1;
            }
            if (x.cost > y.cost) {
                return 1;
            }
            return 0;
        }
    }

    public static void dijkstra(GraphAL g, int source) {
        int []previous = new int[g.count];
        int []dist = new int[g.count];
        boolean []visited = new boolean[g.count];
        for (int i=0 ; i<g.count ; i++) {
            previous[i] = -1;
            dist[i] = 999999;
        }

        dist[source] = 0;
        previous[source] = -1;
        EdgeComparator comp = new EdgeComparator();
        PriorityQueue<Edge> queue = new PriorityQueue<Edge>(100, comp);
        Edge node = new Edge(source, 0);
        queue.add(node);
        while(queue.isEmpty() != true) {
            node = queue.peek();
            queue.remove();
            source = node.dest;
            visited[source] = true;
            LinkedList<Edge> adl = g.Adj.get(source);
            for (Edge adn : adl) {
                int dest = adn.dest;
                int alt = adn.cost + dist[source];
                if (dist[dest] > alt && visited[dest] == false) {
                    dist[dest] = alt;
                    previous[dest] = source;
                    node = new Edge(dest, alt);
                    queue.add(node);
                }
            }
            int count = g.count;
            for (int i=0 ; i<count ; i++) {
                if (dist[i] == Integer.MAX_VALUE) {
                    System.out.println("\n node is " + i + " prev " + previous[i] + " distance : Unreachable");
                } else {
                    System.out.println("node is " + i + " prev " + previous[i] + " distance : " + dist[i]);
                }
            }
        }
    }
}