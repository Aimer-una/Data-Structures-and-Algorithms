package greed;

public class LeetCode134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            // 当前所耗油量小于0直接跳过当前车站点
            if (curSum < 0){
                start = i+1;
                curSum = 0;
            }
        }

        if (totalSum < 0){
            return -1;
        }
        return start;
    }
}
