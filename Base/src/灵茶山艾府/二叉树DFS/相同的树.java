package 灵茶山艾府.二叉树DFS;

import binarytree.TreeNode;

public class 相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 情况一：两个节点都是空的
        if (p == null && q == null){
            return true;
        }

        // 情况二：只有一个节点是空的
        if (p == null || q == null){
            return false;
        }

        // 情况三:两个节点都不为空，它们的值也不同
        if (p.val != q.val){
            return false;
        }

        boolean leftIsSame = isSameTree(p.left, q.left);
        boolean rightIsSame = isSameTree(p.right, q.right);

        return leftIsSame && rightIsSame;
    }
}
