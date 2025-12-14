package 灵茶山艾府.数据结构.栈;

public class 比较含退格的字符串 {
    public boolean backspaceCompare(String s, String t) {
        int indexS = 0;
        int indexT = 0;
        int i = s.length() - 1;
        int j = t.length() - 1;
        while (i >= 0 || j >= 0){
            while (i >= 0){
                if (s.charAt(i) == '#'){
                    indexS++;
                    i--;
                }else if (indexS > 0){
                    indexS--;
                    i--;
                }else {
                    break;
                }
            }
            while (j >= 0){
                if (t.charAt(j) == '#'){
                    indexT++;
                    j--;
                }else if (indexT > 0){
                    indexT--;
                    j--;
                }else {
                    break;
                }
            }
            if (j >= 0 && i >= 0){
                if (s.charAt(i) != t.charAt(j)){
                    return false;
                }
            }else {
                if (j >= 0 || i >= 0){
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }
}
