package binarytree.leetcode;

import binarytree.TreeNode;

public class LeetCode104 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSize = maxDepth(root.left);
        int rightSize = maxDepth(root.right);
        int max = 1 + Math.max(leftSize,rightSize);
        return max;
    }
}
