package hot100;

import binarytree.TreeNode;

public class 二叉搜索树中第K小的元素 {
    int k;
    int ans;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node){
        if (node == null || k <= 0){
            return;
        }
        // 左
        dfs(node.left);
        // 中
        if (--k == 0){
            ans = node.val;
        }
        // 右
        dfs(node.right);
    }
}
