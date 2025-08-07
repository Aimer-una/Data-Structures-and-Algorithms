package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.HashSet;

// 对称二叉树
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left,root.right);
    }

    public boolean compare(TreeNode left,TreeNode right){
        if (left == null && right != null){
            return false;
        }
        if (left != null && right == null){
            return false;
        }
        if (left == null && right == null){
            return true;
        }
        if (left.val != right.val){
            return false;
        }
        // 比较外侧
       boolean compareOutside = compare(left.left,right.right);
        // 比较内测
       boolean compareInside  = compare(left.right,right.left);
       return compareInside && compareOutside;
    }
}
