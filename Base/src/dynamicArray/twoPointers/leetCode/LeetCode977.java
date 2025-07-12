package dynamicArray.twoPointers.leetCode;

import java.util.Arrays;

public class LeetCode977 {

    public static void main(String[] args) {
        int [] num = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortArrayDouble(num)));
    }

    /**
     * 解题思路:
     * 元素的平方最大值一定产生在原数组的最左边或者最右边
     * 我们将最大值放入平方数组的最后一个位置就好了。
     */
    public static int[] sortArrayDouble(int [] num){
        int[] result = new int[num.length];
        int right = num.length - 1;
        int left = 0;
        // 最后一个位置索引
        int wait = num.length - 1;
        while (left <= right){
            if (num[left] * num[left] > num[right] * num[right]){
                result[wait] = num[left] * num[left];
                wait--;
                left++;
            }else {
                result[wait] = num[right] * num[right];
                wait--;
                right--;
            }
        }
        return result;
    }
}
