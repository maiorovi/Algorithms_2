package firstweek;

import java.io.InputStream;
import java.util.ArrayList;

public class UnDirectedGraph {
    private final int v;
    private Bag<Integer>[] container;

    public UnDirectedGraph(int V) {
        this.v = V;
        container = (Bag<Integer>[]) new Bag[V];
        for (int i = 0; i < V; i++) {
            container[i] = new Bag<Integer>();
        }
    }

    public void addEdge(int v, int w) {
        container[v].put(w);
        container[w].put(v);
    }

    public int v() {
        return v;
    }

    public Iterable<Integer> adj(int v) {
        return container[v];
    }

    public String toString() {
        return super.toString();
    }

}
