import java.util.ArrayList;

public class DFS {
    public static ArrayList<Integer> search(Graph graph, int src) {
        boolean[] visited = new boolean[graph.count()];
        ArrayList<Integer> order = new ArrayList<>();

        helper(graph, src, visited, order);

        return order;
    }

    private static void helper(Graph graph, int src, boolean[] visited, ArrayList<Integer> order) {
        if (visited[src]) {
            return;
        }

        visited[src] = true;
        order.add(src);

        for (int i = 0; i < graph.matrix[src].length; i++) {
            if (graph.matrix[src][i] == 1) {
                helper(graph, i, visited, order);
            }
        }

        return;
    }
}
