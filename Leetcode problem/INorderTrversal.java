import java.util.*;

import javax.swing.tree.TreeNode;

public class INorderTrversal {
    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }

    private void inorderHelper(TreeNode node, List<Integer> result) {
        if (node == null)
            return;

        inorderHelper(node.left, result);
        result.add(node.val);
        inorderHelper(node.right, result);
    }

}
