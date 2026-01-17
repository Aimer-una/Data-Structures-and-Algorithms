package 灵茶山艾府.数据结构.堆;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class 无限集中的最小数字 {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Set<Integer> set = new HashSet<>();
    int number = 1;
    public int popSmallest() {
        if (pq.isEmpty()){
            return number++;
        }
        Integer x = pq.poll();
        set.remove(x);
        return x;
    }

    public void addBack(int num) {
        if (number > num && !set.contains(num)){
            pq.offer(num);
            set.add(num);
        }
    }
}
