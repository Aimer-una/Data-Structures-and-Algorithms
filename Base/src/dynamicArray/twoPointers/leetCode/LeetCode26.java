package dynamicArray.twoPointers.leetCode;

/**
 * 有序数组去除重复元素，并返回唯一元素的个数
 */
public class LeetCode26 {

    public static void main(String[] args) {
        int[] nums = {2,2,1,1};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int slowPointer = 0;
        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[slowPointer] != nums[fastPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];

            }
        }
        return slowPointer + 1;
    }

}
