package 灵茶山艾府.双指针滑动窗口.滑动窗口;



public class 每个字符最多出现两次的最长子字符串 {
    public int maximumLengthSubstring(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int ans = 0;
        int [] arr = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            int b = charArray[i] - 'a';
            arr[b]++;
            while (arr[b] > 2){
                // 把左窗口的值减掉
                arr[charArray[left] - 'a']--;
                // 初始化下一个窗口的位置
                left++;
            }
            ans = Math.max(ans,i-left+1);
        }
        return ans;
    }
}
