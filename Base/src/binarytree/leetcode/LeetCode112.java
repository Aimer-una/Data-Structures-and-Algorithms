package binarytree.leetcode;

import binarytree.TreeNode;

// 路径总和
public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return getSum(root,targetSum-root.val);
    }

    public boolean getSum(TreeNode root, int targetSum){
        if (root.left == null && root.right == null && targetSum == 0){
            return true;
        }
        if (root.left == null && root.right == null && targetSum != 0){
            return false;
        }
        if (root.left != null){
            targetSum -= root.left.val;
            if (getSum(root.left,targetSum)) return true;
            targetSum += root.left.val;
        }
        if (root.right != null){
            targetSum -= root.right.val;
            if (getSum(root.right,targetSum)) return true;
            targetSum += root.right.val;
        }
        return false;
    }
}
