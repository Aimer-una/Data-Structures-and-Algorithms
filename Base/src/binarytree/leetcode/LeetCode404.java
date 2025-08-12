package binarytree.leetcode;

import binarytree.TreeNode;

// 获得左节点之和
public class LeetCode404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 0;
        }
        int leftSize = sumOfLeftLeaves(root.left);
        if (root.left != null && root.left.left == null && root.left.right == null){
            leftSize = root.left.val;
        }
        int rightSize = sumOfLeftLeaves(root.right);
        return rightSize+leftSize;
    }
}
