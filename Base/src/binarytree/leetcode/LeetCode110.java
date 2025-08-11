package binarytree.leetcode;

import binarytree.TreeNode;

// 平衡二叉树
public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        return getHigh(root) != -1;
    }

    public int getHigh(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftSize = getHigh(root.left);
        if (leftSize == -1){
            return -1;
        }
        int rightSize = getHigh(root.right);
        if (rightSize == -1){
            return -1;
        }
        int result;
        if (Math.abs(rightSize - leftSize) > 1){
            result = -1;
        }else {
            result =1 + Math.max(rightSize,leftSize);
        }
        return result;
    }
}
