package binarytree.leetcode;

import binarytree.TreeNode;

public class LeetCode654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length);
    }

    public TreeNode construct(int[] nums,int leftSize,int rightSize) {
        if (rightSize - leftSize < 1) {// 没有元素了
            return null;
        }
        if (rightSize - leftSize == 1) {// 只有一个元素
            return new TreeNode(nums[leftSize]);
        }
        int index = leftSize;
        int maxValue = nums[index];
        // 找出最大值
        for (int i = leftSize; i < rightSize; i++) {
            if (nums[i] > maxValue){
                maxValue = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(maxValue);
        root.left = construct(nums,leftSize,index);
        root.right = construct(nums,index+1,rightSize);

        return root;
    }
}
