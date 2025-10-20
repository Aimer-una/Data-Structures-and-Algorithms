package 灵茶山艾府.双指针滑动窗口.双指针;

public class 复写零 {
    public void duplicateZeros(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        while (j < n){
            if (arr[i] == 0){
                j++;
            }
            i++;
            j++;
        }
        i--;
        j--;
        while (i >= 0){
            if (j < n){
                arr[j] = arr[i];
            }
            if (arr[i] == 0 && --j >=0 ){
                arr[j] = 0;
            }
            i--;
            j--;
        }
    }
}
