package 灵茶山艾府.数据结构.栈;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class 按递增顺序显示卡牌 {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> index = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            index.add(i);
        }
        int[] ans = new int[n];
        Arrays.sort(deck);
        for (int card : deck) {
            ans[index.pollFirst()] = card;
            if (!index.isEmpty()){
                index.add(index.pollFirst());
            }
        }
        return ans;
    }
}
