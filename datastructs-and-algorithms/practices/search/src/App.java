public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = {28, 63, 45, 78, 26, 90, 67, 34, 87, 21, 54, 98, 36, 42, 78, 60, 34, 91, 23, 67};
        
        // int linear = Linear.search(arr, 21);
        // System.out.println(linear >= 0 ? "Index: " + linear : "Number not found");
        
        // int binary = Binary.search(arr, 21);
        // System.out.println(binary >= 0 ? "Index: " + binary : "Number not found");
        
        
        // Graph graph = new Graph(new int[5][5]);
        // graph.edge(0, 2, 4);
        // graph.edge(1, 4, 13);
        // graph.edge(1, 3, 9);
        // graph.edge(2, 2, 17);
        // graph.edge(0, 4, 7);
        // graph.edge(4, 2, 2);
        // graph.edge(4, 2, 8);
        
        // ArrayList<Integer> breadth = BFS.search(graph, 0);
        // System.out.println(breadth.toString());
        // ArrayList<Integer> depth = DFS.search(graph, 0);
        // System.out.println(depth.toString());
        

        BST tree = new BST();
        tree.insert(new Node("Frodo"));
        tree.insert(new Node("Samwise"));
        tree.insert(new Node("Gimli"));
        tree.insert(new Node("Aragorn"));
        tree.insert(new Node("Legolas"));
        tree.insert(new Node("Gandalf"));
        tree.insert(new Node("Boromir"));
        
        tree.print(); 
        System.out.println(tree.search("Gandalf"));
        System.out.println(tree.search("Peregrin"));
    }
}
