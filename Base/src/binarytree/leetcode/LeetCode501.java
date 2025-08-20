package binarytree.leetcode;

import binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
// 501. 二叉搜索树中的众数
public class LeetCode501 {
    List<Integer> list;
    int count;
    int maxCount;
    TreeNode pre;

    public int[] findMode(TreeNode root) {
        list = new ArrayList<Integer>();
        maxCount = 0;
        count = 0;
        pre = null;

        traversal(root);
        int [] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public void traversal(TreeNode cur){
        if (cur == null){
            return;
        }
        // 左
        traversal(cur.left);

        // 中
        if (pre == null){
            count = 1;
        }else if (cur.val == pre.val){
            count++;
        }else {
            count = 1;
        }
        pre = cur;
        if (count == maxCount){
            list.add(cur.val);
        }else if (count > maxCount){
            list.clear();
            list.add(cur.val);
            maxCount = count;
        }

        // 右
        traversal(cur.right);
    }
}
