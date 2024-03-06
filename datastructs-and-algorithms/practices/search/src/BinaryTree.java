public class BinaryTree {
    Node root = null;

    public void preOrderPrint(Node bt) {
        if (bt == null) {
            return;
        }

        System.out.println(bt.value);
        preOrderPrint(bt.left);
        preOrderPrint(bt.right);
    }

    public void inOrderPrint(Node bt) {
        if (bt == null) return;

        inOrderPrint(bt.left);
        System.out.println(bt.value);
        inOrderPrint(bt.right);
    }

    public void postOrderPrint(Node bt) {
        if (bt == null) return;

        postOrderPrint(bt.left);
        postOrderPrint(bt.right);
        System.out.println(bt.value);
    }
}
