public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 28, 63, 45, 78, 26, 90, 67, 34, 87, 21, 54, 98, 36, 42, 78, 60, 34, 91, 23, 67 };
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // int linear = Linear.search(arr, 21);
        // System.out.println(linear >= 0 ? "Index: " + linear : "Number not found");

        // int binary = Binary.search(arr, 21);
        // System.out.println(binary >= 0 ? "Index: " + binary : "Number not found");

        
    }
}
