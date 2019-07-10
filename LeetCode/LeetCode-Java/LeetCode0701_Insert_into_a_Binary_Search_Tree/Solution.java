package LeetCode0701_Insert_into_a_Binary_Search_Tree;

/**
 * Coder : chenshuaiyu
 * Time : 2018/12/13 13:48
 */
public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        TreeNode currentNode = root;

        while (node != null && node.val != val){
            if (node != root)
                currentNode =  node;
            if (node.val < val)
                node = node.right;
            else
                node = node.left;
        }
        if (currentNode.val > val)
            currentNode.left = new TreeNode(val);
        else
            currentNode.right = new TreeNode(val);
        return root;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(4);
        root.right = new TreeNode(7);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        TreeNode ans = solution.insertIntoBST(root, 5);
        System.out.println(ans.val);
    }
}
