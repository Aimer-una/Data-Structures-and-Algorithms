package binarySearch;

public class BinarySearchBase {
    public static void main(String[] args) {
        int [] a = {1,5,7,8,10,27};
        int result = binarySearch(a, 5);
        System.out.println(result);

    }

    /**
     *
     * @param a 带查找的升序数组
     * @param target 待查找的目标值
     * @return 目标数据找不到返回-1，找到了返回目标数据的索引值
     */
    public static  int binarySearch(int[]a , int target){
        // 获取初始索引值
        int i = 0;
        int j = a.length - 1;
        while (i <= j){
            int m = (i+j)/2;
            if (target < a[m]){ // 目标值在左边
                // 目标值小于中间值
                j = m-1;
            }else if (target > a[m]){ // 目标值在右边
                // 目标值大于中间值
                i = m+1;
            }else {
                return m;
            }
        }
        return -1;
    }

    /*
        问题一:为什么i<=j 意味着区间有未比较的元素 而不是i<j
            因为:i和j它们指向的元素也会参与比较
     */

}
