package 灵茶山艾府.二叉树DFS;

import binarytree.TreeNode;

public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root.left,root.right);
    }

    public boolean isSameTree(TreeNode q, TreeNode p){
        if (q == null && p == null){
            return true;
        }

        if (q == null || p == null){
            return false;
        }

        if (q.val != p.val){
            return false;
        }

        boolean leftIsSame = isSameTree(p.left, q.right);
        boolean rightIsSame = isSameTree(p.right, q.left);

        return leftIsSame && rightIsSame;

    }
}
