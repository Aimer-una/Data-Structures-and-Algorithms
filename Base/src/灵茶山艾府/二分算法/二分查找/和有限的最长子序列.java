package 灵茶山艾府.二分算法.二分查找;

import java.util.Arrays;

public class 和有限的最长子序列 {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        // 前缀和
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        for (int i = 0; i < queries.length; i++) {
            queries[i] = lowerBound(nums,queries[i]+1);
        }
        return queries;
    }

    private int lowerBound(int[] queries , int target){
        int left = 0;
        int right = queries.length - 1;
        while (left <= right){
            int mid = (left + right) >>> 1;
            if (queries[mid] >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
