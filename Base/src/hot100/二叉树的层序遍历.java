package hot100;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历 {
    //  两个数组的写法
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null){
            return List.of();
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<TreeNode> cur = List.of(root);
        while (!cur.isEmpty()){
            List<TreeNode> nxt = new ArrayList<>();
            List<Integer> vals = new ArrayList<>(); // 预分配空间
            for (TreeNode node : cur) {
                vals.add(node.val);
                if (node.left != null){
                    nxt.add(node.left);
                }
                if (node.right != null){
                    nxt.add(node.right);
                }
            }
            cur = nxt;
            ans.add(vals);
        }
        return ans;
    }

    // 使用队列写法
    public List<List<Integer>> levelOrderQueue(TreeNode root) {
        if (root == null){
            return List.of();
        }
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            // 预分配空间
            List<Integer> list = new ArrayList<>(n);
            while (n-- > 0){
                TreeNode node = queue.poll();
                if (node.left != null){
                    queue.add(node.left);
                }

                if (node.right != null){
                    queue.add(node.right);
                }
                list.add(node.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
