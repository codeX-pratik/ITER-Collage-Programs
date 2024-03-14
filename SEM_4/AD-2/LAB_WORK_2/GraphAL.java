import java.util.*;

public class GraphAL {
    
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

    // DFS using stack
    public static boolean dfsStack(GraphAL g, int source, int target) {
        int count = g.count;
        boolean []visited = new boolean[count];
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(source);
        visited[source] = true;

        while (stk.isEmpty() == false) {
            int cur = stk.pop();
            LinkedList<Edge> adl = g.Adj.get(cur);
            for (Edge adn : adl) {
                if (visited[adn.dest] == false) {
                    visited[adn.dest] = true;
                    stk.push(adn.dest);
                }
            }
        }
        return visited[target];
    }

    // BFS using queue
    public static boolean bfs(GraphAL g, int source, int target) {
        int count = g.count;
        boolean []visited = new boolean[count];
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(source);
        visited[source] = true;

        while (q.isEmpty() == false) {
            int cur = q.remove();
            LinkedList<Edge> adl = g.Adj.get(cur);
            for(Edge adn : adl) {
                if (visited[adn.dest] == false) {
                    visited[adn.dest] = true;
                    q.add(adn.dest);
                }
            }
        }
        return visited[target];
    }

    public static int countAllPathDFS(GraphAL g, boolean []visited, int source, int dest) {
        if (source == dest) {
            return 1;
        }
        int count = 0;
        visited[source] = true;
        LinkedList<Edge> adl = g.Adj.get(source);
        for (Edge adn : adl) {
            if (visited[adn.dest] == false) {
                count += countAllPathDFS(g, visited, adn.dest, dest);
            }
            visited[source] = false;
        }
        return count;
    }

    public static int countAllPath(GraphAL g, int src, int dest) {
        int count = g.count;
        boolean []visited = new boolean[count];
        return countAllPathDFS(g, visited, src, dest);
    }

    static class EdgeComparator implements Comparator<Edge> {
        public int compare(Edge x, Edge y) {
            if (x.cost < y.cost) {
                return -1;
            } if (x.cost >y.cost) {
                return 1;
            } return 0;
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

    public static void main(String[] args) {
        GraphAL g = new GraphAL(5);
        g.addDirectedEdge(0, 1, 1);
        g.addDirectedEdge(0, 2, 1);
        g.addDirectedEdge(1, 2, 1);
        g.addDirectedEdge(2, 3, 1);
        g.addDirectedEdge(2, 3, 1);
        g.print();

        dijkstra(g, 0);
    }
}
