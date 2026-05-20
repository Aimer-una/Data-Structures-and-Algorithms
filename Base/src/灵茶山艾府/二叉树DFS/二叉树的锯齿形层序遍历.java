package 灵茶山艾府.二叉树DFS;

import binarytree.TreeNode;

import java.util.*;

public class 二叉树的锯齿形层序遍历 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null){
            return List.of();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()){
            int n = q.size();
            List<Integer> vals = new ArrayList<>(n);
            while (n -- > 0){
                TreeNode node = q.poll();
                if (node.left != null){
                    q.add(node.left);
                }
                if (node.right != null){
                    q.add(node.right);
                }
                vals.add(node.val);
            }
            if (ans.size() % 2 > 0){
                Collections.reverse(vals);
            }
            ans.add(vals);
        }
        return ans;
    }
}
