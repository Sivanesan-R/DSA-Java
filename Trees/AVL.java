public class AVL {
    Node root;

    public AVL() {

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
        return rotate(node);
    }

    public Node rotate(Node node){
        if (height(node.left) - height(node.right) < 1) {
            // left heavy
            if (node.left != null && height(node.left.left) - height(node.left.right) > 0 ) {
                // left left case
                return rightRotate(node);
            }
            if (node.left != null && height(node.left.left) - height(node.left.right) < 0 ) {
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            // right heavy
            if (height(node.right.left) - height(node.right.right) < 0 ) {
                // right right case
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) < 0 ) {
                // right left case
                node.left = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left),height(p.right) + 1);
        c.height = Math.max(height(c.left),height(c.right) + 1);
        
        return c;
    }
    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;+
        c.right = t;

        p.height = Math.max(height(p.left),height(p.right) + 1);
        c.height = Math.max(height(c.left),height(c.right) + 1);
        
        return p;
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

