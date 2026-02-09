package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

import java.util.HashSet;
import java.util.Set;
//
public class 从链表中移除在数组中存在的节点 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (cur.next != null){
            if (set.contains(cur.next.val)){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
