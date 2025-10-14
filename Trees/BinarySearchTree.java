public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {

    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val){
        root = insert(val, root);
    }
    private Node insert(int val,Node node){
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.val) {
            node.left = insert(val, node.left);
        }
        if (val > node.val) {
            node.right = insert(val, node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void populate(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatedSorted(int [] nums){
        populatedSorted(nums,0,nums.length);
    }

    private void populatedSorted(int[] nums,int s,int e){
        if (s >= e) {
            return;
        }
        int mid =(e + s) / 2;

        this.insert(nums[mid]);
        populatedSorted(nums, s, mid);
        populatedSorted(nums, mid + 1, e);
    }

    public boolean balanced(){
        return balanced(root);

    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root,"Root Node : ");
    }
    private void display(Node node,String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.val);
        display(node.left,"Left Child of "+ node.val + " : ");
        display(node.right,"Right Child of "+ node.val + " : ");
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if (node == null) {
            return;
        }
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);

    }
    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node node){
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.println(node.val);
        InOrder(node.right);

    }
    public void postOrde(){
        PostOrder(root);
    }
    private void PostOrder(Node node){
        if (node == null) {
            return;
        }
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.val);

    }

}



class Node {
    int val, height;
    Node left, right;

    public Node(int val) {
        this.val = val;
    }

    public int getvalue() {
        return val;
    }
}
