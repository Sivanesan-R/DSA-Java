public class averageOfLevel {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        double average = 0;
        for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode = queue.poll();
            
            average += currentNode.val;

            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
        }
        result.add(average);
    }

    return result;
    }

    
}
