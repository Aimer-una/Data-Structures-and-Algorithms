package 灵茶山艾府.数据结构.栈;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2参议院 {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiants = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R'){
                radiants.offer(i);
            }else {
                dire.offer(i);
            }
        }
        while (!radiants.isEmpty() && !dire.isEmpty()){
            // Radiant阵营的人更靠前，他将禁止Dire阵营中首个拥有权力的人，然后它重新排到队伍最后，等待下一次轮到它执行权力
            if (radiants.peek() < dire.peek()){
                action(radiants,dire,n);
            }else {
                // Dire阵营的人更靠前，他将禁止Radiant阵营中首个拥有权力的人，然后它重新排到队伍最后，等待下一次轮到它执行权力
                action(dire,radiants,n);
            }
        }
        return radiants.isEmpty()? "Dire" : "Radiant";
    }

    private void action(Queue<Integer> q1 , Queue<Integer> q2 , int n){
        q2.poll();
        q1.offer(q1.poll() + n);
    }
}
