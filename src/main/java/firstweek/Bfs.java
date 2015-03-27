package firstweek;

import java.util.ArrayDeque;

public class Bfs {
    private int[] pathTo;
    private boolean[] marked;
    private int size;

    public Bfs(UnDirectedGraph graph, int s) {
        size = graph.v();
        pathTo = new int[size];
        marked = new boolean[size];

        bfs(graph, s);
    }

    private void bfs(UnDirectedGraph graph, int s) {
    ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        queue.addLast(s);
        marked[s] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.getFirst();
            for (int vert : graph.adj(currentVertex)) {
                if (!marked[vert]) {
                    marked[vert] = true;
                    queue.addLast(vert);
                    pathTo[vert] = currentVertex;
                }
            }
        }
    }
}
