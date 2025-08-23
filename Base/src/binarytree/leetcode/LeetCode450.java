package binarytree.leetcode;

import binarytree.TreeNode;

// 450. 删除二叉搜索树中的节点
public class LeetCode450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }
        // 找到要删除的节点
        if (root.val == key){
            // 要删除的是叶子节点，左右节点为空
            if (root.left == null && root.right == null){
                return null;
            }else if (root.left == null && root.right != null){
                // 左节点为右节点不为空
                return root.right;
            }else if (root.left != null && root.right == null){
                // 左节点不为空右节点为空
                return root.left;
            }else {
                // 左右节点都不为空
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                cur.left = root.left;
                return root.right;
            }
        }
        if (root.val > key){
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key){
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
