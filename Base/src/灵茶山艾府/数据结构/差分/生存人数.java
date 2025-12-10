package 灵茶山艾府.数据结构.差分;

public class 生存人数 {
    public int maxAliveYear(int[] birth, int[] death) {
        int[] cnt = new int[2002];
        // 差分
        for (int i = 0; i < birth.length; i++) {
            cnt[birth[i]] += 1;
            cnt[death[i]+1] -= 1;
        }
        // 前缀和
        for (int i = 1900; i < cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        int peopleNum = 0;
        int minYear = 0;
        for (int i = 1900; i < cnt.length; i++) {
            if (cnt[i] > peopleNum){
                peopleNum = cnt[i];
                minYear = i;
            }
        }
        return minYear;
    }
}
