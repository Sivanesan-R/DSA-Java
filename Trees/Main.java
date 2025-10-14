public class Main {
    public static void main(String[] args) {
        int[] arr = {30, 20, 10, 25, 40, 50, 45};
        AVL tree = new AVL();
        tree.populate(arr);
        tree.display();
        tree.rotate(tree.root);
        tree.display();
    }
}
