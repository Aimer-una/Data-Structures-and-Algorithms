package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

// 获取完全二叉树的所有节点数量
public class LeetCode222 {
    // 利用满二叉树方法实现
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;
        int leftSize = 0,rightSize=0;
        while (leftNode != null){
            leftNode = leftNode.left;
            leftSize++;
        }
        while (rightNode != null){
            rightNode = rightNode.right;
            rightSize++;
        }
        if (leftSize == rightSize){
            return (2<<leftSize)-1;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right+1;
    }

    // 层序遍历法
    public int countNodesOrder(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int size = 0;
        while (!queue.isEmpty()){
            int len = queue.size();
            while (len > 0){
                size++;
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.left);
                }
                len--;
            }
        }
        return size;
    }
}
