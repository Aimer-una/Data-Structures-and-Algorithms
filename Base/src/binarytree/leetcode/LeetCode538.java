package binarytree.leetcode;

import binarytree.TreeNode;
// 538. 把二叉搜索树转换为累加树
public class LeetCode538 {
    int pre = 0;
    public TreeNode convertBST(TreeNode root) {
        convertBST1(root);
        return root;
    }

    public void convertBST1(TreeNode root) {
        if (root == null){
            return;
        }
        // 右
        convertBST1(root.right);
        // 中间
        root.val += pre;
        pre = root.val;
        // 左边
        convertBST1(root.left);
    }
}
