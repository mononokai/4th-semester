public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder print:");
        tree.preOrderPrint(tree.root);
        System.out.println("Inorder Print:");
        tree.inOrderPrint(tree.root);
        System.out.println("Postorder print:");
        tree.postOrderPrint(tree.root);
    }
}
