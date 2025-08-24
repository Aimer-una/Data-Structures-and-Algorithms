package binarytree.leetcode;

import binarytree.TreeNode;

public class LeetCode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
       return sortedArrayToBST1(nums,0,nums.length-1);
    }

    public TreeNode sortedArrayToBST1(int[]nums,int begin,int end){
        if (begin > end){
            return null;
        }
        int mid = (begin+end)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST1(nums,begin,mid-1);
        node.right = sortedArrayToBST1(nums,mid+1,end);
        return node;
    }
}
