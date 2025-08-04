package binarytree.leetcode;

import binarytree.TreeNode;

public class LeetCode226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        swapChildren(root);
        swapChildren(root.left);
        swapChildren(root.right);
        return root;
    }

    private void swapChildren(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
