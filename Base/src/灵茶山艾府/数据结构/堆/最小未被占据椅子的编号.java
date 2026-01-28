package 灵茶山艾府.数据结构.堆;

import java.util.*;

public class 最小未被占据椅子的编号 {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        // 创建一个n行2列的二维数组，记录到达的时间和人
        int[][] arrival = new int[n][2];
        // 创建一个n行2列的二维数组，记录离开的时间和人
        int[][] leaving = new int[n][2];

        for (int i = 0; i < n; i++) {
            // 记录到达的人和时间
            arrival[i][0] = times[i][0];
            arrival[i][1] = i;
            // 记录离开的人和时间
            leaving[i][0] = times[i][1];
            leaving[i][1] = i;
        }
        // 按时间升序排序
        Arrays.sort(arrival,(a,b) -> Integer.compare(a[0],b[0]));
        Arrays.sort(leaving,(a,b) -> Integer.compare(a[0],b[0]));

        // 可用椅子
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.offer(i);
        }

        // 记录每个人坐的椅子
        Map<Integer,Integer> map = new HashMap<>();

        // 双指针模拟离开事件
        int j = 0;
        for (int[] arr : arrival) {
            int time = arr[0];
            int person = arr[1];

            // 处理所有在当前到达时间之前（或等于）离开的人
            while (j < n && leaving[j][0] <= time){
                int leavingPerson = leaving[j][1];
                int freedSeat = map.get(leavingPerson);
                pq.offer(freedSeat);
                j++;
            }
            // 当前人坐下
            int seat = pq.poll();
            map.put(person,seat);

            if (targetFriend == person){
                return seat;
            }
        }
        return -1;
    }
}
