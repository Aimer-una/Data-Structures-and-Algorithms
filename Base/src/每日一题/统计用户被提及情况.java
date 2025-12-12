package 每日一题;

import java.util.ArrayList;
import java.util.List;

public class 统计用户被提及情况 {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] ans = new int[numberOfUsers];
        List<int[]> es = new ArrayList<>(); // (timestamp, type, id)
        int all = 0;
        for (List<String> e : events) {
            int curT = Integer.parseInt(e.get(1)); // 当前时间
            String mention = e.get(2);
            if (e.get(0).charAt(0) == 'O') { // 离线
                int i = Integer.parseInt(mention);
                es.add(new int[]{curT, 1, i});
                es.add(new int[]{curT + 60, -1, i});
            } else if (mention.charAt(0) == 'A') { // @所有人
                all++;
            } else if (mention.charAt(0) == 'H') { // @所有在线用户
                all++;
                es.add(new int[]{curT, 2, -1});
            } else { // @id
                for (String s : mention.split(" ")) {
                    int i = Integer.parseInt(s.substring(2));
                    ans[i]++;
                }
            }
        }

        es.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        int here = 0;
        for (int[] e : es) {
            int type = e[1];
            if (type == 2) {
                here++;
            } else {
                // 注意 HERE 排在后面，还没有计入发生在此刻的 HERE 消息
                ans[e[2]] += type * here; // type=1 是加，-1 是减
            }
        }

        for (int i = 0; i < numberOfUsers; i++) {
            ans[i] += all;
        }
        return ans;
    }
}
