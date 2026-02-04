package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

import java.util.HashSet;
import java.util.Set;

public class 链表组件 {
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        boolean isValid = false;
        while (head != null){
            if (set.contains(head.val)){
                if (!isValid){
                    isValid = true;
                    ans++;
                }
            }else {
                isValid = false;
            }
            head = head.next;
        }
        return ans;
    }
}
