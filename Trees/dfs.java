import javax.swing.tree.TreeNode;
import java.util.*;

public class dfs {
    private TreeNode root;
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;

    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);
        return Math.max(leftHeight, rightHeight) + 1;

    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;

    }

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode current = root;
        while (current != null) {
            if (current.left != null) {
                TreeNode temp = current.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && node.val <= low) {
            return false;
        }
        if (high != null && node.val >= high) {
            return false;
        }

        boolean leftTree = helper(node.left, low, node.val);
        boolean rightTree = helper(node.right, node.val, high);

        return leftTree && rightTree;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }

    int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        return helper(root, k).val;
    }

    public TreeNode helper(TreeNode root, int k) {

        if (root == null) {
            return null;
        }
        TreeNode left = helper(root.left, k);

        if (left != null) {
            return left;
        }

        count++;
        if (count == k) {
            return root;
        }

        return helper(root.right, k);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        int r = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == r) {
                index = i;
            }
        }

        TreeNode node = new TreeNode(r);
        node.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        node.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length),
                Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return node;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public int sumNumbers(TreeNode root) {
        return helps(root, 0);
    }

    int helps(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        sum = sum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return sum;
        }

        return helps(node.left, sum) + helps(node.left, sum);
    }
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = helper(node.left);
        int right = helper(node.right);

        left = Math.max(0,left);
        right = Math.max(0,right);


        int pathans = left + right + node.val;

        ans = Math.max(pathans, ans);

        return Math.max(left, right) + node.val;
    }

    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int val = height(root.left) - height(root.right);

        if (Math.abs(val) <= 1&& isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }
        return false;

        

    }
    int height(Node node){
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static int isSumProperty(Node root) {
        if (root == null || root.left == null && root.right == null) {
            return 1;
        }
        int leftdata = (root.left != null) ? root.left.data : 0;
        int rightdata = (root.right != null) ? root.right.data : 0;

        if (root.data == leftdata + rightdata) {
            return 1; 
        }
        return 0;
    }

    boolean isBST(Node root) {
        return isBSTHelper(root, null, null);
    }

    private boolean isBSTHelper(Node node, Integer low, Integer high) {
        if (node == null) {
            return true;
        }
        if (low != null && node.data <= low) {
            return false;
        }
        if (high != null && node.data >= high) {
            return false;
        }

        return isBSTHelper(node.left, low, node.data) && isBSTHelper(node.right, node.data, high);
    }

    public Node sortedArrayToBST(int[] nums) {
       return populate(nums,0,nums.length);
        
    }

    public Node populate(int [] arr,int start,int end){
        if (start >= end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        Node node = new Node(arr[mid]);
        node.left = populate(arr, start, mid-1);
        node.right = populate(arr, mid+1, end);
        return node;

    }
    public Node insert(int val){
        root =  insert(root,val);
        return root;
    }
    private Node insert(Node node,int val){
        if (node == null) {
            return new Node(val);   
        }
        if (root.val > val) {
            node.left = insert(node.left,val);
        }
        if (root.val < val) {
            node.left = insert(node.right,val);
        }
        return node;
    }

}
