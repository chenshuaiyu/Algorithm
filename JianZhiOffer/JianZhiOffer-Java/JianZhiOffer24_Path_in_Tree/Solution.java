package JianZhiOffer24_Path_in_Tree;

import java.util.ArrayList;

public class Solution {
    private ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        find(root, list, target);
        return ans;
    }

    private void find(TreeNode root, ArrayList<Integer> list, int target) {
        if (root == null) return;
        if (target < root.val) return;
        list.add(root.val);
        if (target == root.val && root.left == null && root.right == null)
            ans.add(new ArrayList<>(list));
        if (root.left != null)
            find(root.left, list, target - root.val);
        if (root.right != null)
            find(root.right, list, target - root.val);
        list.remove(list.size() - 1);
    }
}
