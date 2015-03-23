package firstweek;

public class Dfs {
    private int vertex;

    boolean[] marked;
    int[] pathTo;


    public Dfs(UnDirectedGraph graph, int vertex ) {
        this.vertex = vertex;
        marked = new boolean[graph.v()];
        pathTo = new int[graph.v()];

        dfs(graph, vertex);
    }

    public boolean marked(int w) {
        return marked[w];
    }



    private void dfs(UnDirectedGraph graph, int vertex) {

        for (int v : graph.adj(vertex)) {
            if (!marked[v]) {
                marked[v] = true;
                dfs(graph, v);

                pathTo[v] = vertex;
            }
        }
    }
}
