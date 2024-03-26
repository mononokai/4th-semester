import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static ArrayList<Integer> search(Graph graph, int src) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[graph.count()];
        ArrayList<Integer> order = new ArrayList<>();

        q.offer(src);
        visited[src] = true;

        while (!q.isEmpty()) {
            src = q.poll();
            order.add(src);

            for (int i = 0; i < graph.matrix[src].length; i++) {
                if (graph.matrix[src][i] != 0 && !visited[i]) {
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }

        return order;
    }
}
