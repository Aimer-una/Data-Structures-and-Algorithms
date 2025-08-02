package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 后序遍历 左右中
public class LeetCode145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(result,root);
        return result;
    }

    public void preorder(List<Integer> list , TreeNode root){
        if (root == null){
            return;
        }
        preorder(list,root.left);
        preorder(list,root.right);
        list.add(root.val);
    }
}
