package 灵茶山艾府.数据结构.栈;

import java.util.ArrayList;
import java.util.List;

public class 简化路径 {
    public String simplifyPath(String path) {
        List<String> stk = new ArrayList<>();
        // 通过‘/’对path进行分组
        for (String s : path.split("/")) {
            if (s.isEmpty() || ".".equals(s)){
                continue;
            }
            if (!"..".equals(s)){
                stk.add(s);
            }else if (!stk.isEmpty()){
                stk.remove(stk.size() - 1);
            }
        }
        return "/" + String.join("/",stk);
    }
}
