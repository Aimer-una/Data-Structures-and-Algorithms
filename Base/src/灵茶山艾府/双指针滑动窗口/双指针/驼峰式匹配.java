package 灵茶山艾府.双指针滑动窗口.双指针;

import java.util.ArrayList;
import java.util.List;

public class 驼峰式匹配 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (String query : queries) {
            int i = 0;
            boolean valid = true;
            for (int j = 0; j < query.length(); j++) {
                char c = query.charAt(j);
                if (i < pattern.length() && pattern.charAt(i) == c){
                    i++;
                }
                else if (c >= 'A' && c <= 'Z'){
                    valid = false;
                    break;
                }
            }
            if (i == pattern.length() && valid){
                ans.add(true);
            }else {
                ans.add(false);
            }
        }
        return ans;
    }
}
