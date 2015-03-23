package firstweek;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UndirectedGraphTest {

    private UnDirectedGraph graph;

    @Before
    public void setUp() {
        graph = new UnDirectedGraph(4);
    }

    @Test
    public void returnTheNumbeOfVerteciesInTheGraph() {
        assertThat(graph.v()).isEqualTo(3);
    }

    @Test
    public void connectsTwoVerteciesWithEdge() {
        graph.addEdge(1,3);
        assertThat(graph.adj(1).iterator().next()).isEqualTo(3);
    }

}
