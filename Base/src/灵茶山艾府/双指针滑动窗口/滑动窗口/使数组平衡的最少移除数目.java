package 灵茶山艾府.双指针滑动窗口.滑动窗口;

import java.util.Arrays;

public class 使数组平衡的最少移除数目 {
/*    给定一个整数数组 nums 和一个整数 k，要求删除最少的元素，使得剩余元素中任意两个元素都满足：

    min × k ≥ max

    等价于：剩下的所有元素都在某个区间 [x, x*k] 内。

   所以问题转化为：找出最长的子序列（注意：不要求连续，但排序后可以看作连续）
   使得最大值 ≤ 最小值 × k。因为数组可以重排，所以我们先排序。
 */
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            // 求a * k ≥ b
            while ((long)nums[left] * k < nums[right]){
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        // 将最大长度 - 留下来的所有数，就是最少要删掉的数
        return nums.length - max;
    }
}
