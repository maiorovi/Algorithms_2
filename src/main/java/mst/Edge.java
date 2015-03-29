package mst;

public class Edge implements Comparable<Edge> {

    private final int v;
    private final int w;
    private final double weight;

    public Edge(int v, int w, double weight) {
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public int either() {
        return v;
    }

    public int other(int vertex) {
        if (this.v == vertex) {
            return w;
        }
        return vertex;
    }

    @Override
    public int compareTo(Edge that) {
        if (that.weight > this.weight) return -1;
        if (that.weight == this.weight) return 0;
        if (that.weight < this.weight) return 1;
        return 0;
    }

    public String toString() {
        return null;
    }

    public double weight() {
        return weight;
    }
}
