package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null){
            int val = cur.next.val;
            if (val == cur.next.next.val){
                while (cur.next != null && cur.next.val == val){
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
