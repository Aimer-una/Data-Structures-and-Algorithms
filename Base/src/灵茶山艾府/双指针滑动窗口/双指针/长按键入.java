package 灵茶山艾府.双指针滑动窗口.双指针;

public class 长按键入 {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        while (j < typed.length()){
            if (i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if (j > 0 && typed.charAt(j) == typed.charAt(j-1)){
                j++;
            }else {
                return false;
            }
        }
        return i == name.length();
    }
}
