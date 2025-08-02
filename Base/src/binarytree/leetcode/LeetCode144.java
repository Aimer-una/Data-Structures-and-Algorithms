package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 前序遍历 中左右
public class LeetCode144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(result,root);
        return result;
    }
    public void preorder(List<Integer> list , TreeNode root){
        if (root == null){
            return;
        }
        list.add(root.val);
        preorder(list,root.left);
        preorder(list,root.right);
    }
}
