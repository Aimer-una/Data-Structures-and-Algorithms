package binarytree.leetcode;

import binarytree.TreeNode;

// 二叉树最小深度
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSize = minDepth(root.left);
        int rightSize = minDepth(root.right);
        if (root.left == null){
           return rightSize+1;
        }
        if (root.right == null){
            return leftSize+1;
        }
        return Math.min(rightSize,leftSize)+1;
    }
}
