package 每日一题;

import java.util.ArrayList;
import java.util.List;

public class 优惠券校验器 {
    public  List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        // 检查字符串是否为空
        List<Integer> validIndices  = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (code[i] == null || businessLine[i] == null){
                continue;
            }
            if (filterString(code[i]) && checkBusinessLine(businessLine[i]) && isActive[i]){
                validIndices.add(i);
            }
        }

        // 按题目要求排序：先按 businessLine 顺序，再按 code 字典序
        validIndices.sort((i, j) -> {
            int orderI = getBusinessOrder(businessLine[i]);
            int orderJ = getBusinessOrder(businessLine[j]);
            if (orderI != orderJ) {
                return Integer.compare(orderI, orderJ);
            }
            return code[i].compareTo(code[j]); // 字典序
        });

        // 构建结果
        List<String> ans = new ArrayList<>();
        for (int i : validIndices) {
            ans.add(code[i]);
        }
        return ans;
    }
    // 判断字符串是否合法
    private  boolean filterString(String s){
        if (s == null || s.isEmpty()) return false;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            // Character.isLetter(c) → 判断是否是字母（a-z, A-Z）
            // Character.isDigit(c) → 判断是否是数字（0-9）
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }

    private boolean checkBusinessLine(String s) {
        return "electronics".equals(s) ||
                "grocery".equals(s) ||
                "pharmacy".equals(s) ||
                "restaurant".equals(s);
    }

    // 获取业务线的排序优先级
    private int getBusinessOrder(String business) {
        switch (business) {
            case "electronics":
                return 0;
            case "grocery":
                return 1;
            case "pharmacy":
                return 2;
            case "restaurant":
                return 3;
            default:
                return 4; // 不该出现
        }
    }
}
