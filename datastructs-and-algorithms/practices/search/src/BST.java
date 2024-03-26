public class BST {
    Node root = null;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        if (root == null) {
            root = node;
            return root;
        } 
        
        String first = root.value.compareTo(node.value) > 0 ? node.value : root.value;
        
        if (first == node.value) {
            root.left = insertHelper(root.left, node);
        } 
        else {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }

    public void print() {
        printHelper(root);
    }

    private void printHelper(Node root) {
        if (root != null) {
            printHelper(root.left);
            System.out.println(root.value);
            printHelper(root.right);
        }
    }

    public boolean search(String value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(Node root, String value) {
        if (root == null) {
            return false;
        }
        
        if (root.value == value) {
            return true;
        }
        else if (root.value.compareTo(value) > 0) {
            return searchHelper(root.left, value);
        }
        else {
            return searchHelper(root.right, value);
        }
    }

    // public void remove(String value) {

    // }

    // private Node removeHelper(Node root, String value) {
    //     return null;
    // }

    // private String successor(Node root) {
    //     return null;
    // }

    // private String predecessor(Node root) {

    // }
}
