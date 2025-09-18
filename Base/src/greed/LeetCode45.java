package greed;
// 45. 跳跃游戏 II
public class LeetCode45 {
    public int jump(int[] nums) {
        if (nums.length == 1){
            return 0;
        }
        // 跳跃次数
        int count = 0;
        // 最大覆盖范围
        int maxDistance = 0;
        // 当前覆盖范围
        int preDistance = 0;
        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance,nums[i]+i);
            if (maxDistance == nums.length - 1){
                count++;
                break;
            }
            if (i == preDistance){
                preDistance = maxDistance;
                count++;
            }
        }
        return count;
    }
}
