package greed;

import java.util.Arrays;
import java.util.LinkedList;
// 406. 根据身高重建队列
public class LeetCode406 {
    //  贪心策略：先排高的，再插矮的
    /*
    高的人看不到矮的人
    矮的人插到队伍里，不会影响高的人的 k 值
    所以我们先排高的，然后让矮的“插队”
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if (a[0] == b[0]) return a[1] - b[1]; // 身高相同k小的在前面（升序）
            return b[0] - a[0]; // 升高不同，高的在前（降序）
        });

        LinkedList<int[]> que = new LinkedList<>();
        // 遍历每一个人，按k插入
        for (int[] p : people) {
            // 把 p 插入到位置 p[1]
            que.add(p[1],p);
        }
        return que.toArray(new int[people.length][]);
    }
}
