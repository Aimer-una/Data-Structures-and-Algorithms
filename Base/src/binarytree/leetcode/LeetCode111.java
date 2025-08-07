package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// 二叉树最小深度
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftSize = minDepth(root.left);
        int rightSize = minDepth(root.right);
        if (root.left == null){
           return rightSize+1;
        }
        if (root.right == null){
            return leftSize+1;
        }
        return Math.min(rightSize,leftSize)+1;
    }

    // 层序排列方法
    public int minDepthOrder(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            size = size+1;
            while (len > 0){
                TreeNode node = queue.poll();
                if (node.right == null && node.left == null){
                    return size;
                }
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
                len--;
            }
        }
        return size;
    }
}
