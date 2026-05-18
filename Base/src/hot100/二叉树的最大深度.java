package hot100;

import binarytree.TreeNode;

public class 二叉树的最大深度 {
    public int maxDepth(TreeNode root) {
        // 边界条件
        if (root == null){
            return 0;
        }
        // 左
        int left = maxDepth(root.left);
        // 右
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }
}
