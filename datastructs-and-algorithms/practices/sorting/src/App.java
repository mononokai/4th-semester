public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = { 5, 1, 4, 2, 8 };

        // int[] bubbleSorted = Bubble.sort(arr);
        // System.out.println(Arrays.toString(bubbleSorted));

        Graph graph = new Graph(new int[5][5]);
        graph.edge(0, 2, 4);
        graph.edge(1, 4, 13);
        graph.edge(1, 3, 9);
        graph.edge(2, 2, 17);
        graph.edge(0, 4, 7);
        graph.edge(4, 2, 2);
        graph.edge(4, 2, 8);

        int[] distances = DijkstrasAlgo.shortestPath(graph);
        for (int i = 0; i < distances.length; i++) {
            System.out.println("Point " + i + " distance: " + distances[i]);
        }
    }
}
