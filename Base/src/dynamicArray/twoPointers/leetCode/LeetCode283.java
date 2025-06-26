package dynamicArray.twoPointers.leetCode;

import java.util.Arrays;

public class LeetCode283 {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        System.out.println(moveZeroes(nums));
    }
    // 首先将所有不为0的数据放入新数组中
    public static String moveZeroes(int[] nums) {
        int slowPointer = 0;
        for(int fastPointer = 0; fastPointer < nums.length; fastPointer++){
            if(nums[fastPointer] != 0){
                nums[slowPointer] = nums[fastPointer];
                slowPointer++;
            }
        }
        // 剩下的就都是等于0的了
        for (int fastPointer = slowPointer; fastPointer < nums.length; fastPointer++) {
            nums[slowPointer] = 0;
            slowPointer++;
        }
      return Arrays.toString(nums);
    }
}
