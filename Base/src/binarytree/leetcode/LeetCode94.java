package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 中序遍历 左中右
public class LeetCode94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(result,root);
        return result;
    }

    public void preorder(List<Integer> list , TreeNode root){
        if (root == null){
            return;
        }
        preorder(list,root.left);
        list.add(root.val);
        preorder(list,root.right);
    }
}
