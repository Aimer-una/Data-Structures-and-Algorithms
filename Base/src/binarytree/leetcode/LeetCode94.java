package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    // 中序遍历 左中右(迭代)
    public List<Integer> inorderTraversalIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if (cur != null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                result.add(cur.val);
                cur=cur.right;
            }
        }
        return result;
    }
}
