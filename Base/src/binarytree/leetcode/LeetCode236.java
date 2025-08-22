package binarytree.leetcode;

import binarytree.TreeNode;
//  二叉树的最近公共祖先
public class LeetCode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q){
            return root;
        }
        // 左
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // 右
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // 中
        if (left == null && right == null){
            return null;
        }else if (left != null && right == null){
            return left;
        }else if (right != null && left == null){
            return right;
        }else {
            return root;
        }
    }
}
