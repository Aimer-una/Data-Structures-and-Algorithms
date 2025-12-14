package 灵茶山艾府.数据结构.栈;

import java.util.ArrayList;
import java.util.List;

public class 棒球比赛 {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String op : operations) {
            switch (op.charAt(0)) {
                case '+':
                    list.add(list.get(list.size() - 2) + list.get(list.size() - 1));
                    break;
                case 'C':
                    list.remove(list.size()-1);
                    break;
                case 'D':
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                default:
                    list.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (Integer x : list) {
            sum += x;
        }
        return sum;
    }
}
