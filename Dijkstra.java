
//import org.w3c.dom.Node;

import java.util.*;
import java.util.*;

class Dijkstra {
//    static class Node implements Comparable<Node> {
//        int vertex, weight;
//        Node(int vertex, int weight) {
//            this.vertex = vertex;
//            this.weight = weight;
//        }
//        public int compareTo(Node other) {
//            return this.weight - other.weight; // Min Heap
//        }
//    }
//
//    public static void dijkstra(int V, List<List<Node>> graph, int src) {
//        int[] dist = new int[V];
//        Arrays.fill(dist, Integer.MAX_VALUE);
//        dist[src] = 0;
//
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        pq.add(new Node(src, 0));
//
//        while (!pq.isEmpty()) {
//            Node current = pq.poll();
//            int u = current.vertex;
//            System.out.println(u);
//            for (Node neighbor : graph.get(u)) {
//                int v = neighbor.vertex, weight = neighbor.weight;
//
//                if (dist[u] + weight < dist[v]) {
//                    dist[v] = dist[u] + weight;
//                    pq.add(new Node(v, dist[v]));
//                }
//            }
//        }
//
//        System.out.println("Shortest distances from source:");
//        for (int i = 0; i < V; i++) {
//            System.out.println("To " + i + " -> " + dist[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        int V = 5;
//        List<List<Node>> graph = new ArrayList<>();
//        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
//
//        // Add edges (u → v, weight)
//        graph.get(0).add(new Node(1, 4));
//        graph.get(0).add(new Node(2, 1));
//        graph.get(2).add(new Node(1, 2));
//        graph.get(1).add(new Node(3, 1));
//        graph.get(2).add(new Node(3, 5));
//        graph.get(3).add(new Node(4, 3));
//
//        for (List l: graph){
//            System.out.println(l);
//        }
//        dijkstra(V, graph, 0); // Source = 0
//    }
public static class Node implements Comparable<Node> {
        int v;
        int w;
    Node(int v, int w) {
        this.v = v;
        this.w = w;
    }
    @Override
    public int compareTo(Node o) {
        return this.w - o.w;
    }
}
public static void main(String[] args) {
    List<List<Node>> graph = new ArrayList<>();
//    Scanner sc = new Scanner(System.in);
    System.out.println("enter no of nodes");
    int numberOfNode = 5;
    for (int i = 0; i < numberOfNode; i++) {
        graph.add(new ArrayList<>());
    }

    graph.get(0).add(new Node(1,3));
    graph.get(0).add(new Node(2,4));
    graph.get(1).add(new Node(3,2));
    graph.get(1).add(new Node(2,5));
    graph.get(2).add((new Node(4,5)));
    graph.get(3).add(new Node(4,1));

    dijkstra(numberOfNode , graph, 0);
}

    public static void dijkstra(int n, List<List<Node>> graph, int src){

    int []dist = new int[n];
    Arrays.fill(dist,Integer.MAX_VALUE);
    dist[src] = 0;
    PriorityQueue<Node> pq = new PriorityQueue<Node>();
    pq.add(new Node(src, 0));

    while(!pq.isEmpty()){
        Node current = pq.poll();
        int currV = current.v;
        for(Node neighbours: graph.get(currV)){
            int v = neighbours.v, w = neighbours.w;
            if(dist[currV] + w < dist[v]){
                dist[v] = dist[currV] + w;
                pq.add(new Node(v,dist[v]));
            }
        }

    }
    System.out.println("Shortest distances from source:");
        for (int i = 0; i < n; i++) {
            System.out.println("To " + i + " -> " + dist[i]);
        }
    }
}
