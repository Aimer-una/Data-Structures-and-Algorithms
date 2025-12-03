package 灵茶山艾府.数据结构.前缀和;

public class 在区间范围内统计奇数数目 {
    public int countOdds(int low, int high) {
       return (high + 1) / 2 - low / 2;
    }
}
