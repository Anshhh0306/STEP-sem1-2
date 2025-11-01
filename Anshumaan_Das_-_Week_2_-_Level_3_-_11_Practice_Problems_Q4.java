import java.util.*;

class Graph {
    private int V;
    private List<List<Node>> adj;

    static class Node implements Comparator<Node> {
        public int node;
        public int cost;

        public Node() {}

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node node1, Node node2) {
            return Integer.compare(node1.cost, node2.cost);
        }
    }

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Node(v, weight));
        adj.get(v).add(new Node(u, weight)); // Undirected
    }

    public int[] dijkstra(int src) {
        PriorityQueue<Node> pq = new PriorityQueue<>(V, new Node());
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Node(src, 0));

        while (!pq.isEmpty()) {
            Node u = pq.poll();
            for (Node v : adj.get(u.node)) {
                if (dist[u.node] + v.cost < dist[v.node]) {
                    dist[v.node] = dist[u.node] + v.cost;
                    pq.add(new Node(v.node, dist[v.node]));
                }
            }
        }
        return dist;
    }
}

public class W2L3Q4 {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 1);
        g.addEdge(1, 2, 2);
        g.addEdge(1, 3, 5);
        g.addEdge(2, 3, 8);
        g.addEdge(3, 4, 6);

        int[] dist = g.dijkstra(0);
        System.out.println("Shortest paths from node 0:");
        for (int i = 0; i < dist.length; i++) {
            System.out.println("To " + i + ": " + dist[i]);
        }
    }
}