import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = { 5, 1, 4, 2, 8 };
        int[] arr2 = new int[1000];
        Random rng = new Random();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rng.nextInt(1000);
        }

        // long start = System.currentTimeMillis();
        // int[] bubbleSorted = Bubble.sort(arr2);
        // System.out.println(Arrays.toString(bubbleSorted));
        // long end = System.currentTimeMillis();
        // NumberFormat formatter = new DecimalFormat("#0.00000");
        // System.out.println("Took " + formatter.format((end - start) / 1000d) + "
        // seconds");

        // long start = System.currentTimeMillis();
        // int[] quickSorted = Quick.sort(arr2);
        // System.out.println(Arrays.toString(quickSorted));
        // long end = System.currentTimeMillis();
        // NumberFormat formatter = new DecimalFormat("#0.00000");
        // System.out.println("Took " + formatter.format((end - start) / 1000d) + "seconds");

        long start = System.currentTimeMillis();
        int[] mergeSorted = Merge.sort(arr2);
        System.out.println(Arrays.toString(mergeSorted));
        long end = System.currentTimeMillis();
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.println("Took " + formatter.format((end - start) / 1000d) + " seconds");

        // Graph graph = new Graph(new int[5][5]);
        // graph.edge(0, 2, 4);
        // graph.edge(1, 4, 13);
        // graph.edge(1, 3, 9);
        // graph.edge(2, 2, 17);
        // graph.edge(0, 4, 7);
        // graph.edge(4, 2, 2);
        // graph.edge(4, 2, 8);

        // int[] distances = DijkstrasAlgo.shortestPath(graph);
        // for (int i = 0; i < distances.length; i++) {
        // System.out.println("Point " + i + " distance: " + distances[i]);
        // }
    }
}
