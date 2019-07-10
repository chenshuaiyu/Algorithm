package LeetCode0404_Sum_of_Left_Leaves;

import java.util.LinkedList;

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null)
            return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.val;
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    public int sumOfLeftLeaves1(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null)
            queue.addLast(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.pollFirst();
            TreeNode left = node.left;
            TreeNode right = node.right;
            if (left != null) {
                if (left.left == null && left.right == null)
                    ans += left.val;
                else
                    queue.addLast(left);
            }
            if (right != null)
                queue.addLast(right);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        int ans = solution.sumOfLeftLeaves(treeNode);
        System.out.println(ans);
    }
}
