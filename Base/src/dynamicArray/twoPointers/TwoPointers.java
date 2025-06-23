package dynamicArray.twoPointers;


import java.util.Arrays;

/**
 * 利用双指针法移除元素
 */
public class TwoPointers {
    public static void main(String[] args) {
        int[]a = {1,3,4,5,6,3,7};
       // System.out.println(twoPointers(a, 3));
        System.out.println(removeElement(a, 3));
       // System.out.println(removeElementUsingTwoPointers(a, 3));
    }

    /**
     * 返回的是 5，说明前 5 个元素才是有效的，其余的没有被处理或覆盖。
     * 数组的内容是被就地修改了，但只保证前 slowIndex 个位置上的元素是正确的。
     * 后面的元素是“垃圾数据”，它们可能还是原来的值，也可能被覆盖，这取决于具体执行路径。
     */

    /*
    为什么数组里还留着一个 3？	因为算法只覆盖了前面的部分，后面的元素不会被处理，只是逻辑上忽略掉。
    这样算是“删除”了吗？	是的，逻辑上删除了，只是没有物理清除整个数组。
    我该怎么用这个结果？	只使用前 slowIndex 个元素即可。
     */

    public static int removeElement(int[] nums, int val) {
        // 快慢指针
        // 慢指针指向的是新数组的下标
        int slowIndex = 0;
        // 快指针指向的是旧数组的数据
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return slowIndex;
    }


}
