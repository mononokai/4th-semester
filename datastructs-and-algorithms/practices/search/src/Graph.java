public class Graph {
    int[][] matrix;

    public Graph(int[][] matrix) {
        this.matrix = matrix;
    }

    public void edge (int last, int next, int weight) {
        matrix[last][next] = weight;
        matrix[next][last] = weight;
    }

    public int count() {
        return matrix.length;
    }
}
