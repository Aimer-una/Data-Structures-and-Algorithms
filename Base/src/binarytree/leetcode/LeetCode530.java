package binarytree.leetcode;

import binarytree.TreeNode;

public class LeetCode530 {
    int result = Integer.MAX_VALUE;
    TreeNode pre;
    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return result;
    }

    public void getMin(TreeNode cur){
        // 左
        if (cur == null){
            return;
        }
        // 中
        getMin(cur.left);
        if (pre != null){
            result = Math.min(result, cur.val - pre.val);
        }
        pre = cur;
        // 右
        getMin(cur.right);
    }
}
