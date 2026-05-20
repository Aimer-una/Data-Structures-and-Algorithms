package hot100;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的层序遍历 {
    // 两个数组的写法
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
}
