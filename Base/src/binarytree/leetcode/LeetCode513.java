package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class LeetCode513 {
    int Deep = -1;
    int value = 0;
    public int findBottomLeftValue(TreeNode root) {
        value = root.val;
        findLeftValue(root,0);
        return value;
    }

    private void findLeftValue (TreeNode root,int deep) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            if (deep > Deep){
                value = root.val;
                Deep = deep;
            }
        }
        if (root.left != null){
            findLeftValue(root.left , deep+1);
        }
        if (root.right != null){
            findLeftValue(root.right,deep+1);
        }
    }

    // 层序遍历
    public int findBottomLeftValueOrder(TreeNode root) {
        if (root == null){
            return 0;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            root = queue.poll();
            if (root.right != null){
                queue.offer(root.right);
            }
            if (root.left != null){
                queue.offer(root.left);
            }
        }
        return root.val;
    }
}
