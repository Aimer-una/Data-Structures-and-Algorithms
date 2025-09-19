package greed;
// 柠檬酸找零
public class LeetCode860 {
    public  boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0; //20可写可不不写，为了更好的表达提议写上了
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                if (five <= 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            }
            if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    twenty++;
                } else if (five >= 3) {
                    five = five - 3;
                    twenty++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
