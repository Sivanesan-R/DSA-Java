public class binarysearytree {

    private class Node {
        int val;
        Node right;
        Node left;
        int height;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    private Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }
        if (node.val > val) {
            node.left = insert(node.left, val);
        }
        if (node.val < val) {
            node.right = insert(node.right, val);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;

        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populatesort(int[] nums){
        populate(nums,0,nums.length);
    }
    private void populate(int[] nums,int start,int end){
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populate(nums, start, mid);
        populate(nums, mid+1, end);

    }

    public void display(){
        display(root,"Root Node : ");
    }
    private void display(Node node,String details){
        if (node == null) {
            return;
        }
        System.out.println(details + node.val );
        display(node.left, "Left Node : "+ node.val + " : ");
        display(node.right, "right Node : "+ node.val + " : ");

    }

    public void balance(){
        if (balance(root)) {
            System.out.println("YES!");
            return;
        } else {
            System.out.println("No");
            return;
        }
    }
    private boolean balance(Node node){
        return Math.abs(height(node.left)-height(node.right)) <= 1 && balance(node.left) && balance(node.right);
    }

}


