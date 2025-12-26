package 每日一题;

public class 商店的最少代价 {
    public int bestClosingTime(String customers) {
        char[] chars = customers.toCharArray();
        int penalty = 0;
        for (char c : chars) {
            if (c == 'Y'){
                penalty++;
            }
        }
        int minPenalty = penalty;
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {
            penalty += chars[i] == 'N' ? 1 : -1;
            if (penalty < minPenalty){
                minPenalty = penalty;
                ans = i + 1;
            }
        }
        return ans;
    }
}
