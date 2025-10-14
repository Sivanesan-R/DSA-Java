import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BST {
    private Node root;

    public BST(){
        
    }

    private int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public void insert(int val){
        root = insert(val,root);

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
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populate(int [] arr){
        for (int i : arr) {
            this.insert(i);
        }
    }

    public void display(){
        display("Root is : ",root);
    }

    private void display(String gap,Node node){
        if (node == null) {
            return;
        }
        System.out.println(gap + node.val);
        if (node.left != null) {
            display(node.val + " left node val : ", node.left);
        }
        if (node.right != null) {
            display(node.val + " right node val : ", node.right);
        }
        
    }
    public List<List<Integer>> levelOrder(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            
        }

        return result;
    }

}

class Node{
    int val;
    Node right;
    Node left;
    int height;

    public Node(int val){
        this.val = val;
    }
}



public class Ma{
    public static void main(String[] args) {
        int [] arr = {6,7,4,8,3,9,2};
        BFS search= new BFS();
        search.populate(arr); 
        search.display();
    }
}

class Solution {
    public int diagonalPrime(int[][] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
        int left = nums[i][i];
        int right = nums[i][nums.length - 1 - i];
            if(prime(left) && max < left){
                max = left;
            }
            if(prime(right) && max < right){
                max = right;
            }
        }
        return max;
    }

    private boolean prime(int val){
        if (val < 2) return false;
        for (int i = 2; i <= Math.sqrt(val); i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}

