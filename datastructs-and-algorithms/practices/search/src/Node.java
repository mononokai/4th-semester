public class Node {
    String value;
    Node left = null;
    Node right = null;

    public Node (String value) {
        this.value = value;
    }

    protected void addLeft(Node node) {
        this.left = node;
    }

    protected void addRight(Node node) {
        this.right = node;
    }
}
