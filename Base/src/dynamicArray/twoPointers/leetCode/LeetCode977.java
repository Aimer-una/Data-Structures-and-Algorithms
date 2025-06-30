package dynamicArray.twoPointers.leetCode;

import java.util.Arrays;

public class LeetCode977 {

    public static void main(String[] args) {
        int [] num = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(num)));
    }

    /**
     * 解题思路:
     * 元素的平方最大值一定产生在原数组的最左边或者最右边
     * 我们将最大值放入平方数组的最后一个位置就好了。
     */
    public static int[] sortedSquares(int[] nums){
        int left = 0;
        int right = nums.length-1;
        int[]result = new int[nums.length];

        // 写入的最后一个位置
        int writer = nums.length-1;

        // 如左右指针相遇（逐渐靠拢的过程）之后不再循环
        while (left <= right){
            // 如果原数组的左指针对应的平方值大于右指针，那么往新数组最后位置写入左指针对应的平方值
            if (nums[left]*nums[left] > nums[right] * nums[right]){
                result[writer] = nums[left]*nums[left];
                left++;
                writer--;
            }else {
                result[writer] = nums[right]*nums[right];
                right--;
                writer--;
            }
        }
        return result;
    }
}
