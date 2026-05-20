package hot100;

import binarytree.TreeNode;

public class 二叉树的直径 {
    private int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode node){
        if (node == null){
            return 0;
        }

        int left = dfs(node.left);
        int right = dfs(node.right);
        ans = Math.max(ans,left+right); // 两条链拼成路径
        return Math.max(left,right) + 1;
    }
}
