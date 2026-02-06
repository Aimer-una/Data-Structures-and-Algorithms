package 灵茶山艾府.链表数回溯.链表;

import linkList.ListNode;

public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;

        // 右指针先向右走n步
        while (n-- > 0){
            right = right.next;
        }

        while (right.next != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }
}
