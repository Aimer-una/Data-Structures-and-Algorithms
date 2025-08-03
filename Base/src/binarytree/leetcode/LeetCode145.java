package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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

    // 后序遍历 左右中(迭代)
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
            if (node.left != null){
                stack.push(node.left);
            }

            if (node.right != null){
                stack.push(node.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}
