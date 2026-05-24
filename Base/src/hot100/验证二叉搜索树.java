package hot100;

import binarytree.TreeNode;

public class 验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean check(TreeNode node, long min, long max){
        if (node == null){
            return true;
        }

        if (node.val <= min || node.val >= max){
            return false;
        }

        boolean left = check(node.left, min, node.val);
        boolean right = check(node.right, node.val, max);
        return left && right;
    }
}
