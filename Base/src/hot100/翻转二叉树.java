package hot100;

import binarytree.TreeNode;

public class 翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        // 边界条件
        if (root == null){
            return null;
        }
        // 左节点
        TreeNode left = invertTree(root.left); // 翻转左子树
        // 右节点
        TreeNode right = invertTree(root.right); // 翻转右子树
        root.left = right; // 交换左右儿子
        root.right = left;
        return root;
    }
}
