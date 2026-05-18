package hot100;


import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(ans,root);
        return ans;
    }

    private void dfs(List<Integer> list,TreeNode node){
        if (node == null){
            return;
        }
        dfs(list,node.left);
        list.add(node.val);
        dfs(list,node.right);
    }
}
