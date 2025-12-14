package 灵茶山艾府.数据结构.栈;

import java.util.ArrayList;
import java.util.List;

public class 用栈操作构建数组 {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int mx = target[target.length - 1];
        int index = 0;
        for (int i = 1; i < mx; i++) {
            ans.add("Push");
            if (target[index] == i){
                index++;
            }else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}
