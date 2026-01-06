package 灵茶山艾府.二叉树DFS;

import binarytree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return List.of();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            int n = q.size();
            List<Integer> vals = new ArrayList<>(n);
            while (n > 0){
                TreeNode node = q.poll();
                vals.add(node.val);
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
                n--;
            }
            ans.add(vals);
        }
        return ans;
    }
}
