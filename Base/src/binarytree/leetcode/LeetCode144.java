package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 前序遍历 中左右(递归)
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

    // 前序遍历 中左右(迭代)
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return result;
    }
}
