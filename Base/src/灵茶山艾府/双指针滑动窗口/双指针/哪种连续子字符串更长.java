package 灵茶山艾府.双指针滑动窗口.双指针;

public class 哪种连续子字符串更长 {
    public boolean checkZeroOnes(String s) {
        int i = 0;
        int oneAns = 0;
        int zeroAns = 0;
        int n = s.length();
        char[] chars = s.toCharArray();
        while (i < n){
            int start = i;
            i++;
            while (i < n && chars[i] == chars[i-1]){
                i++;
            }
            if (chars[start] == '0'){
               zeroAns = Math.max(zeroAns,i-start);
            }else {
                oneAns = Math.max(oneAns,i-start);
            }
        }
       return oneAns > zeroAns;
    }
}
