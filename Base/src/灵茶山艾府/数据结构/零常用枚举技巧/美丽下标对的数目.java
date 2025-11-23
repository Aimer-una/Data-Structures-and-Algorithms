package 灵茶山艾府.数据结构.零常用枚举技巧;

public class 美丽下标对的数目 {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        int[] cnt = new int[10];
        for (int num : nums) {
            // 获取最后一个数字
            int last = num % 10;
            // 获取第一个数字
            int first = getFirst(num);
            for (int i = 1; i < 10 ; i++) {
                if (gcd(i,last) == 1){
                    ans += cnt[i];
                }
            }
            cnt[first]++;
        }
        return ans;
    }

    // 获取第一个数
    public int getFirst(int x){
        while (x >= 10){
            x /= 10;
        }
        return x;
    }
    public int gcd(int a,int b){
        // 如果被除数小于除数，那么余数就是被除数
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
