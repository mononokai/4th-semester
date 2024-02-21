public class DijkstrasAlgo {
    public static int[] shortestPath(Graph graph) {
        int[] distances = new int[graph.count()];
        boolean[] visited = new boolean[graph.count()];

        for (int i = 0; i < graph.count(); i++) {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        distances[0] = 0;

        for (int i = 0; i < graph.count(); i ++) {
            int closest = closestVertex(distances, visited);

            if (closest == Integer.MAX_VALUE) {
                return distances;
            }

            visited[closest] = true;
            for (int j = 0; j < graph.count(); j++) {
                int dist = distances[closest] + graph.matrix[closest][j];
                if (!visited[j] && graph.matrix[closest][j] != 0 && dist < distances[j]) {
                    distances[j] = dist;
                }
            }
        }

        return distances;
    }

    public static int closestVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int closest = -1;

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] < min && !visited[i]) {
                min = distance[i];
                closest = i;
            }
        }

        return closest;
    }
}
