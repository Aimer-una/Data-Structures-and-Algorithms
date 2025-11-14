package 灵茶山艾府.二分算法.二分查找;

public class 完成旅途的最少时间 {
    public long minimumTime(int[] time, int totalTrips) {
        // 找最慢的公交车时间
        int maxTime = 0;
        long ans = 0;
        for (int i : time) {
            maxTime = Math.max(maxTime,i);
        }
        // 确定左右边界
        long left = 1;
        long right = maxTime * (long)totalTrips;
        while (left <= right){
            long mid = left + right >>> 1;
            if (canFinish(time,mid,totalTrips)) {
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }

    // 判断在 timeLimit 时间内能否完成至少 totalTrips 趟
    private boolean canFinish(int[] time, long timeLimit, int totalTrips) {
        long total = 0;
        for (int i : time) {
            total += timeLimit / i;
            if (total >= totalTrips){
                return true;
            }
        }
        return total >= totalTrips;
    }
}
