package 灵茶山艾府.数据结构.栈;

import java.util.ArrayList;
import java.util.List;

public class 设计浏览器历史记录 {
    List<String> cnt = new ArrayList<>();
    int cur = 0;
    public 设计浏览器历史记录(String homepage) {
        cnt.add(homepage);
    }

    public void visit(String url) {
        cur++;
        cnt.subList(cur,cnt.size()).clear();
        cnt.add(url);
    }

    public String back(int steps) {
       cur = Math.max(cur - steps , 0);
       return cnt.get(cur);
    }

    public String forward(int steps) {
        cur = Math.min(cur + steps , cnt.size() - 1);
        return cnt.get(cur);
    }
}
