package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode cur = head;
        while (cur.next != null){
            if (cur.next.val == cur.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
