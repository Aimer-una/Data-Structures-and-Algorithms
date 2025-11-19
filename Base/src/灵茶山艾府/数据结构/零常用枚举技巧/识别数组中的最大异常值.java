package 灵茶山艾府.数据结构.零常用枚举技巧;

import java.util.HashMap;
import java.util.Map;

public class 识别数组中的最大异常值 {
    public int getLargestOutlier(int[] nums) {
        int total = 0;
        Map<Integer,Integer> ctn = new HashMap<>();
        for (int num : nums) {
            total += num;
            ctn.put(num,ctn.getOrDefault(num,0)+1);
        }
        int ans = Integer.MIN_VALUE;

        // 枚举每一个数假设它是“特殊数字的和”
        for (int num : nums) {
            // 临时把 x 的计数减 1（因为 x 被当作“和”，不能同时当“异常值”或“特殊数字”）
            ctn.put(num,ctn.get(num) - 1);
            // 根据公式：total = x（和） + x（和） + outlier → outlier = total - 2*x
            int outlier = total - 2 * num;
            if (ctn.getOrDefault(outlier,0)>0){
               ans = Math.max(ans,outlier);
            }
            // 把 x 的计数加回来（恢复现场，不影响下一次循环）
            ctn.put(num,ctn.get(num)+1);
        }
        return ans;
    }
}
