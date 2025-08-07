package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// 求二叉树最大深度
public class LeetCode104 {
    // 递归
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSize = maxDepth(root.left);
        int rightSize = maxDepth(root.right);
        int max = 1 + Math.max(leftSize,rightSize);
        return max;
    }

    // 层序搜索
    public int maxDepthOrder(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int max = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            max += 1;
            while (len > 0){
                TreeNode node = queue.pop();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                len--;
            }
        }
        return max;
    }
}
