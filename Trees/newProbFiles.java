import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class newProbFiles {
    private TreeNode root;

    private class Node {
        private TreeNode root;
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = right = null;
        }

        public int inorderSuccessor(Node root, Node x) {
            helper(root, x);
        }

        Node helper(Node node, Node x) {
            if (node == null) {
                return null;
            }
            if (node.val == x.val) {
                return node;
            }
            Node left = helper(node.left, x);
            Node right = helper(node.right, x);

        }

        private Node helps(Node node) {
            if (node == null) {
                return null;
            }
            int left = height(node);
            int right = height(node);

        }

        public TreeNode sortedArrayToBST(int[] nums) {
            return populate(nums, 0, nums.length);
        }

        public TreeNode populate(int[] arr, int start, int end) {
            if (start >= end) {
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(arr[mid]);
            node.left = populate(arr, start, mid - 1);
            node.right = populate(arr, mid + 1, end);
            return node;

        }

        TreeNode insert(int val) {
            return insert(root, val);
        }

        private TreeNode insert(TreeNode node, int val) {
            if (node == null) {
                return new TreeNode(val);
            }
            if (node.val > val) {
                node.right = insert(node.left, val);
            } else {
                node.left = insert(node.right, val);
            }
            return node;
        }

        public boolean isBalanced(TreeNode root) {
            if (root == null) {
                return true;
            }
            return (Math.abs(height(root)) <= 1 && isBalanced(root.left) && isBalanced(root.right));
        }

        private int height(newProbFiles.Node node) {
            if (node == null) {
                return -1;
            }
            return Math.max(height(node.left), height(node.right)) + 1;
        }

        public boolean isSameTree(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(p);
            queue.add(q);
            while (!queue.isEmpty()) {
                TreeNode pnode = queue.poll();
                TreeNode qnode = queue.poll();

                if (pnode == null && qnode == null) {
                    continue;
                }
                if (pnode == null || qnode == null) {
                    return false;
                }
                if (pnode.val != qnode.val) {
                    return false;
                }

                queue.add(pnode.left);
                queue.add(qnode.left);
                queue.add(pnode.right);
                queue.add(qnode.right);
            }
            return true;
        }

        public int kthSmallest(TreeNode root, int k) {
            return helpers(root, k).val;
        }

    TreeNode helpers(TreeNode node,int val,){
        if(node == null){
            return null;
        }
        TreeNode left = helpers(node.left, val);
        if (node.left != null) {
            return node;
        }
        count++;
        if (count == k) {
            return node;
        }
        return helpers(node.right, val);
    }

        public static boolean isSubtree(Node T, Node S) {
            return T != null && (isequal(T, S) || isequal(T.left, S) || isequal(T.left, S));
        }

    static boolean isequal(Node node1,Node node2){
        return (node1 == null && node2 == null) && (node1 != null && node2 != null) && isequal(node1.left, node2.left) && isequal(node1.right, node2.right)
    }

        public String longestPalindrome(String s) {
            char[] arr = s.toCharArray();
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                for (int j = arr.length - 1; j >= i; j--) {
                    if (ispalindrome(arr, i, j)) {
                        String val = s.substring(i, j + 1);
                        if (val.length() > ans.length()) {
                            ans = val;
                        }
                    }
                }
            }
            return ans;

        }

        static boolean ispalindrome(char[] arr, int s, int e) {
            while (s < e) {
                if (arr[s] != arr[e]) {
                    return false;
                }
                s++;
                e--;
            }
            return true;
        }

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int j2 = j + 1; j2 < nums.length; j2++) {
                        if (nums[i] + nums[j] + nums[j2] == 0) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[j2]);
                            result.add(list);
                        }
                    }
                }
            }
            return result;
        }

        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Deque<TreeNode> queue = new LinkedList<>();
            queue.offer(root);
            while (!queue.isEmpty()) {
                int levelsize = queue.size();
                for (int i = 0; i < levelsize; i++) {
                    TreeNode current = queue.poll();
                    if (i == levelsize - 1) {
                        list.add(current.val);
                    }
                    if (current.left != null) {
                        queue.offer(current.left);
                    }
                    if (current.right != null) {
                        queue.offer(current.right);
                    }
                }

            }
            return list;
        }

        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
        }

        static List<Integer> helper(TreeNode node, List<Integer> result) {
            if (node == null) {
                return result;
            }
            result.add(node.val);
            helper(node.left, result);
            helper(node.right, result);

            return result;
        }

        private Integer prev = null;
        private int min = Integer.MAX_VALUE;

        public int minDiffInBST(TreeNode root) {
            minDiffHelper(root, min);
            return min;
        }

    static void minDiffHelper(TreeNode node, int min){
        if(node == null){
            return;
        }
        minDiffHelper(node.left, min);
        if (prev != null) {
            min = Math.min(min, node.val-prev)
        }
        prev = node.val;

        minDiffHelper(node.right, min);
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
            boolean left = helper(node, low, node.val);
            boolean right = helper(node, node.val, high);
            return left && right;
        }

        ArrayList<Integer> inOrder(Node root) {
            ArrayList<Integer> list = new ArrayList<>();

            return helps(root, list);
        }

        ArrayList<Integer> helps(Node node, ArrayList<Integer> result) {
            if (node == null) {
                return result;
            }
            helps(node.left, result);
            result.add(node.val);
            helps(node.right, result);
            return result;
        }

        static ArrayList<ArrayList<Integer>> verticalOrder(Node root) {

        }

        public boolean findTarget(TreeNode root, int k) {
            if (root == null) {
                return false;
            }
            HashMap<Integer, Boolean> map = new HashMap<>();

        }

        boolean helper(TreeNode node, int k, HashMap<Integer, Boolean> map) {
            if (node == null) {
                return false;
            }
            int val = k - node.val;
            if (map.containsValue(val)) {
                return true;
            } else {
                map.put(node.val, true);
            }
            helper(node.left, k, map);
            helper(node.right, k, map);

            return false;
        }

        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }
            return use(root, val);
        }

        private TreeNode use(TreeNode node, int val) {
            if (node == null) {
                return null;
            }
            if (node.val == val) {
                return node;
            }
            use(node.left, val);
            use(node.right, val);
            return null;
        }

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        hell(root, list);
        return list;
    }

    private void hell(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }
        hell(node.left, result);
        hell(node.right, result);
        result.add(node.val);
    }

    public int widthOfBinaryTree(TreeNode root) {
        return hellps(root, 1, 1);
    }

    private int hellps(TreeNode node, int leftNum, int rightNum) {
        if (node == null) {
            return 0;
        }
        int left = hellps(node.left, leftNum * 2, rightNum);
        int right = hellps(node.right, leftNum, rightNum * 2 + 1);

        int ans = (right - left) + 1;
    }

    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int last = arr[arr.length - 1];
        for (int index = arr.length - 1; index > 0; index--) {
            if (arr[index] < last) {
                return arr[index];
            }
        }
        return -1;
    }

}

