package 每日一题;

import binarytree.TreeNode;
// 测试
public class 具有所有最深节点的最小子树 {
    int maxDepth = -1;
    TreeNode ans;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    private int dfs(TreeNode node, int depth){
        if (node == null){
            maxDepth = Math.max(depth,maxDepth);
            return depth;
        }
        int leftMaxDepth = dfs(node.left, depth + 1);
        int rightMaxDepth = dfs(node.right, depth + 1);
        if (leftMaxDepth == rightMaxDepth && leftMaxDepth == maxDepth){
            ans = node;
        }
        return Math.max(leftMaxDepth,rightMaxDepth);
    }
}
