package 灵茶山艾府.双指针滑动窗口.双指针;

public class 移动片段得到字符串 {
    public boolean canChange(String start, String target) {
        if (!start.replace("_","").equals(target.replace("_",""))) {
            return false;
        }

        for (int i = 0,j = 0; i < start.length(); i++) {
            if (start.charAt(i) == '_'){
                continue;
            }
            while (target.charAt(j) == '_'){
                j++;
            }
            if (start.charAt(i) == 'L' && i < j){
                return false;
            }

            if (start.charAt(i) == 'R' && i > j){
                return false;
            }
            j++;
        }
        return true;
    }
}
