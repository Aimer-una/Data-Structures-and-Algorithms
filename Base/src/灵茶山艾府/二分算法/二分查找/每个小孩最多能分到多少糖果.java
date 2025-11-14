package 灵茶山艾府.二分算法.二分查找;

public class 每个小孩最多能分到多少糖果 {
    public int maximumCandies(int[] candies, long k) {
        // 获取最大糖果值
        int maxCandi = 0;
        int ans = 0;
        for (int candy : candies) {
           maxCandi = Math.max(maxCandi,candy);
        }
        int left = 1;
        int right = maxCandi;
        while (left <= right){
            int mid = left + right >>> 1;
            if (canDistribute(candies,mid,k)) {
                // 可行，尝试更大的
                ans = mid;
                left = mid + 1;
            }else {
                // 不可行，减少每人数量
                right = mid - 1;
            }
        }
        return ans;
    }

    private boolean canDistribute(int[] candies, long perChild, long k) {
        long  total = 0;
        for (int candy : candies) {
            total += (long)candy / perChild;
            if (total >= k){
                return true;
            }
        }
        return total >= k;
    }
}
