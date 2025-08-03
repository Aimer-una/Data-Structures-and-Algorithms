package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCode102 {
    public List<List<Integer>> resList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        checkFun02(root);
        return resList;
    }

    //BFS--迭代方式--借助队列
    public void checkFun02(TreeNode node) {
        if (node == null){
            return;
        }
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(node);

        while (!que.isEmpty()){
            int len = que.size();
            List<Integer> itemList = new ArrayList<>();
            while (len > 0){
                TreeNode tmpNode = que.poll();
                itemList.add(tmpNode.val);
                if (tmpNode.left != null){
                    que.offer(tmpNode.left);
                }
                if (tmpNode.right != null){
                    que.offer(tmpNode.right);
                }
                len--;
            }
            resList.add(itemList);
        }
    }
}
