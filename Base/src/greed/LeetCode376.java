package greed;
// 摆动序列
public class LeetCode376 {
    public int wiggleMaxLength(int[] nums) {
        int preDiff = 0;
        int curDiff = 0;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            // 得到当前差值
            curDiff = nums[i+1] - nums[i];
            // 如果当前差值和上一个差值为一正一负
            // 等于0的情况表示初始时的preDiff
            if (preDiff >= 0 && curDiff < 0 || preDiff <= 0 && curDiff > 0){
                result++;
                preDiff = curDiff;
            }
        }
        return result;
    }
}
