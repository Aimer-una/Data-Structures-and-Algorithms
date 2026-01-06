package 灵茶山艾府.二叉树DFS;

import binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class 最大层内元素和 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int level = 1;
        while (!q.isEmpty()){
            int s = 0;
            int n = q.size();
            while (n > 0){
                TreeNode node = q.poll();
                s += node.val;
                if (node.right != null){
                    q.add(node.right);
                }
                if (node.left != null){
                    q.add(node.left);
                }
                n--;
            }
            if (s > max){
                max = s;
                ans = level;
            }
            level++;
        }
        return ans;
    }
}
