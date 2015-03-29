package mst;

import firstweek.Bag;

public class EdgeWeightedGraph {

    private int V;
    private Bag<Edge>[] container;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        container = (Bag<Edge>[]) new Object[V];

        for (int i = 0; i < container.length; i++) {
            container[i] = new Bag<Edge>();
        }
    }

    public void addEdge(int v, int w, double weight) {
        container[v].put(new Edge(v, w, weight));
        container[w].put(new Edge(v, w, weight));
    }

    public Iterable<Edge> adj(int v) {
        return container[v];
    }

}
