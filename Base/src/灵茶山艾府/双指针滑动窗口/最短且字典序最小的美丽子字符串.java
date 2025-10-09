package 灵茶山艾府.双指针滑动窗口;

public class 最短且字典序最小的美丽子字符串 {
    public String shortestBeautifulSubstring(String s, int k) {
        if (s.replace("0","").length() < k){
            return "";
        }
        int ctn1 = 0;
        char[] charArray = s.toCharArray();
        int left = 0;
        String ans = s;
        for (int right = 0; right < charArray.length; right++) {
            ctn1 += charArray[right] - '0';
            while (ctn1 > k || charArray[left] == '0'){
                ctn1 -= charArray[left] - '0';
                left++;
            }
            if (ctn1 == k){
                String t = s.substring(left,right+1);
                if (t.length() < ans.length() || t.length() == ans.length() && t.compareTo(ans) < 0){
                    ans = t;
                }
            }
        }
        return ans;
    }
}
