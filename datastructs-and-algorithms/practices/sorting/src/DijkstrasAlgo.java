public class DijkstrasAlgo {
    public static int[] shortestPath(Graph graph) {
        // initialize distances array and fill with max integers to represent infinite
        // distance
        int[] distances = new int[graph.count()];
        // initialize visited array and fill with false values to show no vertices have
        // been visited
        boolean[] visited = new boolean[graph.count()];
        for (int i = 0; i < graph.count(); i++) {
            distances[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        // set the distance from the source to itself as 0
        distances[0] = 0;

        // loop through all vertices
        for (int i = 0; i < graph.count(); i++) {
            // get the shortest distance from the unvisited vertices to the source
            int closest = closestVertex(distances, visited);

            // if the no more vertices can be reached, return current array of distances
            if (closest == Integer.MAX_VALUE) {
                return distances;
            }

            // set the closest vertex as visited
            visited[closest] = true;

            // loop through all vertices
            for (int j = 0; j < graph.count(); j++) {
                // check the new distance to vertex 'j' through the current closest vertex
                int dist = distances[closest] + graph.matrix[closest][j];

                // if vertex 'j' is not visited, an edge exists from 'j' to 'closest',
                // and the new distance is less than the current shortest distance to 'j'
                if (!visited[j] && graph.matrix[closest][j] != 0 && dist < distances[j]) {
                    // update shortest distance to vertex 'j'
                    distances[j] = dist;
                }
            }
        }

        return distances;
    }

    public static int closestVertex(int[] distances, boolean[] visited) {
        // initialize minimum value with maximum value and the vertex
        int min = Integer.MAX_VALUE;
        int closest = -1;

        // loop through all vertices
        for (int i = 0; i < distances.length; i++) {
            // if the vertex hasn't been visited and its distance is less than the current minimum distance
            if (distances[i] < min && !visited[i]) {
                // update the current minimum distance and vertex
                min = distances[i];
                closest = i;
            }
        }

        return closest;
    }
}
