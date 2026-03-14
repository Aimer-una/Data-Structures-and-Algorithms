package hot100;

public class 最小覆盖子串 {

    public String minWindow(String s, String t) {
        int[] cntS = new int[128];
        int[] cntT = new int[128];
        for (char c : t.toCharArray()) {
            cntT[c]++;
        }
        int left = 0;
        int ansLeft = -1;
        char[] chars = s.toCharArray();
        int n = chars.length;
        int ansRight = n;
        for (int right = 0; right < chars.length; right++) {
            cntS[chars[right]]++;
            while (isCovered(cntS,cntT)){
                if (right - left < ansRight - ansLeft){
                    ansLeft = left;
                    ansRight = right;
                }
                cntS[chars[left]]--;
                left++;
            }
        }
        return ansLeft < 0 ? "" : s.substring(ansLeft,ansRight+1);
    }

    private boolean isCovered(int[] cntS, int[] cntT){
        for(int i = 'a';i <= 'z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        for (int i = 'A'; i <= 'Z'; i++){
            if (cntS[i] < cntT[i]){
                return false;
            }
        }
        return true;
    }
}
